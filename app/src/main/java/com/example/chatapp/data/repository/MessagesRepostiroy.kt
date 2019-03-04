package com.example.chatapp.data.repository

import com.example.communication.CommunicationManager
import com.example.communication.callbacks.MessagesCallback
import com.example.communication.data.ChatMessage
import io.reactivex.Observable
import io.reactivex.subjects.BehaviorSubject


interface MessagesRepository{
    fun sendMessage(message: String)
    fun connectToRoom()
    fun getMessageObservable(): Observable<ChatMessage>
    fun getConnectionObservable(): Observable<Boolean>
    fun getHistoryMessageObservable(): Observable<ChatMessage>
}

class MessagesRepositoryImpl(private val communicationManager: CommunicationManager): MessagesRepository{

    private val messageSubject = BehaviorSubject.create<ChatMessage>()
    private val historyMessageSubject = BehaviorSubject.create<ChatMessage>()
    private val connectionSubject = BehaviorSubject.create<Boolean>()

    override fun sendMessage(message: String){
        communicationManager.sendMessage(message)
    }

    override fun connectToRoom() {
         communicationManager.connectToRoom(object: MessagesCallback{
             override fun onRoomOpenFailure() {
                 connectionSubject.onNext(false)
             }

             override fun onNewMessage(message: ChatMessage) {
                 messageSubject.onNext(message)
             }

             override fun onRoomOpenSuccess() {
                 connectionSubject.onNext(true)
             }

             override fun onHistoryMessage(message: ChatMessage) {
                historyMessageSubject.onNext(message)
             }

         })
    }

    override fun getConnectionObservable(): Observable<Boolean> = connectionSubject

    override fun getMessageObservable(): Observable<ChatMessage> = messageSubject

    override fun getHistoryMessageObservable(): Observable<ChatMessage> = historyMessageSubject
}