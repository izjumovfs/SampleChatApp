package com.example.chatapp.application

import android.app.Application
import com.example.chatapp.di.appComponent
import org.koin.android.ext.android.startKoin

class ChatApplication: Application(){

    override fun onCreate() {
        super.onCreate()
        startKoin(this, appComponent)
    }

}