package com.example.chatapp.viewmodel

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.OnLifecycleEvent
import com.example.chatapp.data.repository.AuthRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class LoginViewModel(private val authRepository: AuthRepository): BaseViewModel(){

    private var username: String? = null

    override fun onCreateView() {
        if (authRepository.isAuthorized()){
            authRepository.login()
        }
    }


    fun usernameChanged(username: String){
        this.username = username
    }


    fun loginClicked(){
        authRepository.authorize(username)
    }

    fun getUsernameObservale() = authRepository.getUsernameObservable()
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())

    fun getLoginObservable() = authRepository.getLoginObservable()
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())

    fun getLoadingObservable() = authRepository.getLoadingObservable()
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())


}