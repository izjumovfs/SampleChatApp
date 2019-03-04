package com.example.chatapp.ui.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.chatapp.R
import com.example.chatapp.ui.adapters.MessagesAdapter
import com.example.chatapp.ui.base.BaseActivity
import com.example.chatapp.viewmodel.ChatViewModel
import com.example.communication.data.ChatMessage
import io.reactivex.rxkotlin.subscribeBy
import kotlinx.android.synthetic.main.activity_chat.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class ChatActivity: BaseActivity(){

    private val chatViewModel: ChatViewModel by viewModel()
    private lateinit var messagesAdapter: MessagesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
        lifecycle.addObserver(chatViewModel)
        subscribeToSubjects()

        etMessage.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                chatViewModel.messageChanged(s.toString())
            }

        })

        btnSend.setOnClickListener{
            chatViewModel.sendMessage()
            etMessage.setText("")
        }

        initRecycler()
    }

    private fun subscribeToSubjects(){
        chatViewModel.addDisposable(chatViewModel.getConnectionObservale()
            .subscribeBy (
                onNext = {
                    if (!it){
                        Toast.makeText(this, getString(R.string.failed_to_connect_to_chat), Toast.LENGTH_LONG).show()
                    }
                }
        ))

        chatViewModel.addDisposable(chatViewModel.getMessagesObservable()
            .subscribeBy(
                onNext={
                    messagesAdapter.addMessage(it)
                    rvMessages.scrollToPosition(messagesAdapter.itemCount-1)
                }

            )
        )

        chatViewModel.addDisposable(chatViewModel.getHistoryMessageObservable()
            .subscribeBy(
                onNext={
                    messagesAdapter.insertMessage(it, 0)
                    rvMessages.scrollToPosition(messagesAdapter.itemCount-1)
                }

            )
        )
    }

    private fun initRecycler(){
        messagesAdapter = MessagesAdapter(ArrayList<ChatMessage>())

        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = RecyclerView.VERTICAL
        rvMessages.layoutManager = linearLayoutManager

        rvMessages.adapter = messagesAdapter
    }

    companion object {
        fun start(context: Context){
            context.startActivity(Intent(context, ChatActivity::class.java))
        }
    }
}