package com.example.chatapp.ui.adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.communication.data.ChatMessage
import android.R.id.message
import android.graphics.Color.parseColor

import android.graphics.drawable.GradientDrawable
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior.setTag

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import com.example.chatapp.R
import com.example.chatapp.util.getDateTime
import kotlinx.android.synthetic.main.their_message.view.*


class MessagesAdapter(private val messages: ArrayList<ChatMessage>) : RecyclerView.Adapter<MessagesAdapter.MessageViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        if (viewType == MessageType.MY.type){
            return MessageViewHolder(inflater.inflate(R.layout.my_message, parent, false))
        }
        else{
            return MessageViewHolder(inflater.inflate(R.layout.their_message, parent, false))
        }
    }

    override fun getItemCount(): Int = messages.size

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        holder.onBind(messages.get(position))
    }

    override fun getItemViewType(position: Int): Int {
        val chatMessage = messages.get(position)
        if (chatMessage.belongsToCurrentUser) {
            return MessageType.MY.type
        }
        return MessageType.THEIR.type
    }


    fun addMessage(message: ChatMessage){
        messages.add(message)
        notifyItemInserted(messages.size-1)
    }

    fun insertMessage(message: ChatMessage, pos: Int){
        messages.add(pos, message)
        notifyItemInserted(pos)
    }

    class MessageViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun onBind(message: ChatMessage){
            if (message.belongsToCurrentUser) {
                itemView.messageBody.text = message.message
                itemView.dateTv.text = getDateTime(message!!.timestamp!!)
            } else {
                itemView.name.text = message.memberData.name
                itemView.messageBody.text = message.message
                itemView.dateTv.text = getDateTime(message!!.timestamp!!)
                //val drawable = itemView.avatar.background as GradientDrawable
                //drawable.setColor(Color.parseColor(message.memberData.color))
            }
        }
    }

    enum class MessageType(val type: Int) {
        MY(1),
        THEIR(2)
    }

}