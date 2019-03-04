package com.example.communication.callbacks

import com.example.communication.data.ChatMessage

interface MessagesCallback{
    fun onRoomOpenFailure()
    fun onRoomOpenSuccess()
    fun onNewMessage(message: ChatMessage)
    fun onHistoryMessage(message: ChatMessage)
}