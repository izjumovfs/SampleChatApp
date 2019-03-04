package com.example.chatapp.data.repository

import android.util.Log
import com.example.chatapp.data.manager.PrefsManager
import com.example.communication.CommunicationManager
import com.example.communication.callbacks.AuthenticationCallback
import com.example.communication.callbacks.LoginCallback
import com.example.communication.data.MemberData
import io.reactivex.Observable
import io.reactivex.subjects.BehaviorSubject

interface AuthRepository{
    fun authorize (username: String?)
    fun getUsernameObservable(): Observable<Boolean>
    fun getLoginObservable(): Observable<Boolean>
    fun getLoadingObservable(): Observable<Boolean>
    fun isAuthorized(): Boolean
    fun login()
}

class AuthRepositoryImpl(private val communicationManager: CommunicationManager, private val prefsManager: PrefsManager) : AuthRepository {
    private val usernameSubject = BehaviorSubject.create<Boolean>()
    private val loadingSubject = BehaviorSubject.create<Boolean>()
    private val loginSubject = BehaviorSubject.create<Boolean>()


    override fun authorize(username: String?) {
        if (username.isNullOrEmpty()){
            usernameSubject.onNext(false)
            return
        }
        loadingSubject.onNext(true)
        communicationManager.authenticate(username, object: AuthenticationCallback{
            override fun onConnectionFailure() {
                loginSubject.onNext(false)
            }

            override fun onAuthenticationSuccess(token: String, memberData: MemberData) {
                prefsManager.saveUser(token, memberData)
                loginSubject.onNext(true)
            }

            override fun onAuthenticationFailure() {
                loginSubject.onNext(false)
            }

        })
    }

    override fun getUsernameObservable(): Observable<Boolean> = usernameSubject

    override fun getLoginObservable(): Observable<Boolean> = loginSubject

    override fun isAuthorized(): Boolean = prefsManager.isAuthorized()

    override fun getLoadingObservable(): Observable<Boolean> = loadingSubject

    override fun login() {
        loadingSubject.onNext(true)
        communicationManager.login(prefsManager.getMemberData(), prefsManager.getToken(), object: LoginCallback {
            override fun onConnectionFailure() {
                loginSubject.onNext(false)
            }

            override fun onAuthenticationSuccess() {
                loginSubject.onNext(true)
            }

            override fun onAuthenticationFailure() {
                loginSubject.onNext(false)
            }

        })
    }
}