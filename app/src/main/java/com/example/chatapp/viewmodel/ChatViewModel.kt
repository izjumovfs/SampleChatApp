package com.example.chatapp.viewmodel


import com.example.chatapp.data.repository.MessagesRepository
import com.example.communication.data.ChatMessage
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ChatViewModel(private val messagesRepository: MessagesRepository): BaseViewModel(){

    private var message: String? = null

    override fun onCreateView() {
        messagesRepository.connectToRoom()
    }

    fun getMessagesObservable(): Observable<ChatMessage>{
        return messagesRepository.getMessageObservable()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }


    fun getConnectionObservale(): Observable<Boolean>{
        return messagesRepository.getConnectionObservable()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }

    fun getHistoryMessageObservable(): Observable<ChatMessage>{
        return messagesRepository.getHistoryMessageObservable()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }


    fun messageChanged(message: String){
        this.message = message
    }

    fun sendMessage(){
        if (message.isNullOrEmpty()){
            return
        }
        messagesRepository.sendMessage(message!!)
    }

}