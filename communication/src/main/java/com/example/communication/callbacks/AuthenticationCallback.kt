package com.example.communication.callbacks

import com.example.communication.data.MemberData

interface AuthenticationCallback{
    fun onConnectionFailure()
    fun onAuthenticationSuccess(token: String, memberData: MemberData)
    fun onAuthenticationFailure()
}