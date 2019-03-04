package com.example.communication


import com.example.communication.callbacks.AuthenticationCallback
import com.example.communication.callbacks.LoginCallback
import com.example.communication.callbacks.MessagesCallback
import com.example.communication.data.ChatMessage
import com.example.communication.data.MemberData
import com.example.communication.util.CHANNEL_ID
import com.example.communication.util.ROOM_NAME
import com.example.communication.util.generateToken
import com.example.communication.util.getRandomColor
import com.example.crypto.CryptoManager
import com.fasterxml.jackson.core.JsonProcessingException
import com.scaledrone.lib.*

import java.lang.Exception


class CommunicationManager{

    private var scaledrone: Scaledrone? = null
    private var cryptoManager: CryptoManager? = null

    fun authenticate(username: String, callback: AuthenticationCallback){
        scaledrone = Scaledrone(CHANNEL_ID)
        scaledrone?.connect(object: Listener{
            override fun onClosed(reason: String?) {

            }

            override fun onOpenFailure(ex: Exception?) {
                callback.onConnectionFailure()
            }

            override fun onFailure(ex: Exception?) {
                callback.onConnectionFailure()
            }

            override fun onOpen() {
                val token = generateToken(scaledrone!!.clientID)
                scaledrone?.authenticate(token, object: AuthenticationListener {
                    override fun onAuthentication() {
                        callback.onAuthenticationSuccess(token, MemberData(username, getRandomColor()))
                    }

                    override fun onAuthenticationFailure(ex: Exception?) {
                        ex?.printStackTrace()
                        callback.onConnectionFailure()
                    }
                })
            }

        })

    }

    fun login(memberData: MemberData, token: String, callback: LoginCallback){
        scaledrone = Scaledrone(CHANNEL_ID, memberData)
        scaledrone?.connect(object: Listener{
            override fun onClosed(reason: String?) {

            }

            override fun onOpenFailure(ex: Exception?) {
                ex?.printStackTrace()
                callback.onConnectionFailure()
            }

            override fun onFailure(ex: Exception?) {
                ex?.printStackTrace()
                callback.onConnectionFailure()
            }

            override fun onOpen() {
                val token = generateToken(scaledrone!!.clientID)
                scaledrone?.authenticate(token, object: AuthenticationListener {
                    override fun onAuthentication() {

                        callback.onAuthenticationSuccess()
                    }

                    override fun onAuthenticationFailure(ex: Exception?) {
                        ex?.printStackTrace()
                        callback.onConnectionFailure()
                    }
                })
            }

        })
    }

    fun connectToRoom(messagesCallback: MessagesCallback){
        cryptoManager = CryptoManager()
        val room = scaledrone?.subscribe(ROOM_NAME, object: RoomListener{


            override fun onOpen(room: Room?) {
                messagesCallback.onRoomOpenSuccess()
            }

            override fun onOpenFailure(room: Room?, ex: Exception?) {
                ex?.printStackTrace()
                messagesCallback.onRoomOpenFailure()
            }

            override fun onMessage(room: Room?, receivedMessage: Message?) {
                try {
                    val belongsToCurrentUser = receivedMessage?.clientID.equals(scaledrone?.clientID)
                    val messageString = cryptoManager!!.decryptData(receivedMessage?.data.toString())
                    val message = ChatMessage(messageString, MemberData("", ""), belongsToCurrentUser, receivedMessage?.timestamp)
                    messagesCallback.onNewMessage(message)

                } catch (e: JsonProcessingException) {
                    e.printStackTrace()
                }

            }

        }/*, SubscribeOptions(100)*/)

//        room?.listenToHistoryEvents { room, receivedMessage ->
//            try {
//                val belongsToCurrentUser = receivedMessage?.clientID.equals(scaledrone?.clientID)
//                val messageString = cryptoManager!!.decryptData(receivedMessage?.data.toString())
//                val message = ChatMessage(messageString, MemberData("", ""), belongsToCurrentUser, receivedMessage?.timestamp)
//                messagesCallback.onHistoryMessage(message)
//                Log.d("MyLog", "HISTORY MESSAGE: REC ID: ${receivedMessage.clientID} AND MY ID: ${scaledrone?.clientID}")
//
//            } catch (e: JsonProcessingException) {
//                e.printStackTrace()
//            }
//        }
    }

    fun sendMessage(message: String){
        val encryptedMessage = cryptoManager?.encryptData(message)
        scaledrone?.publish(ROOM_NAME, encryptedMessage)
    }

}