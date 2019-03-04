package com.example.communication.callbacks

import com.example.communication.data.MemberData

interface LoginCallback{
    fun onConnectionFailure()
    fun onAuthenticationSuccess()
    fun onAuthenticationFailure()
}