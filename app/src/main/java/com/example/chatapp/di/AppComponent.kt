package com.example.chatapp.di

import com.example.chatapp.connectionchecker.ConnectionChecker
import com.example.chatapp.data.manager.PrefsManager
import com.example.chatapp.data.repository.AuthRepository
import com.example.chatapp.data.repository.AuthRepositoryImpl
import com.example.chatapp.data.repository.MessagesRepository
import com.example.chatapp.data.repository.MessagesRepositoryImpl
import com.example.chatapp.viewmodel.ChatViewModel
import com.example.chatapp.viewmodel.LoginViewModel
import com.example.communication.CommunicationManager
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.Module
import org.koin.dsl.module.module

val viewModelModule = module{
    viewModel { LoginViewModel(get()) }
    viewModel { ChatViewModel(get()) }
}

val connectionModule = module{

    single {ConnectionChecker(androidContext())}
}

val repositoryModule = module{
    factory { AuthRepositoryImpl(get(), get()) as AuthRepository }
    factory { MessagesRepositoryImpl(get()) as MessagesRepository}
}

val communicationModule = module{
    single { CommunicationManager() }
}

val managersModule = module{
    single { PrefsManager(androidContext()) }
}

val appComponent: List<Module> = listOf(viewModelModule, connectionModule, repositoryModule, communicationModule, managersModule)