package com.example.chatapp.ui.activity

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.chatapp.R
import com.example.chatapp.ui.base.BaseActivity
import com.example.chatapp.viewmodel.LoginViewModel
import io.reactivex.rxkotlin.subscribeBy
import kotlinx.android.synthetic.main.activity_login.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginActivity : BaseActivity() {

    private val loginViewModel: LoginViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        lifecycle.addObserver(loginViewModel)

        etUsername.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                loginViewModel.usernameChanged(s.toString())
                tilUsername.error = null
            }
        })


        btnLogin.setOnClickListener { view ->
            loginViewModel.loginClicked()
        }

        subscribeToSubjects()
    }

    private fun subscribeToSubjects(){
        loginViewModel.addDisposable(loginViewModel.getUsernameObservale().subscribeBy(onNext =  {
            tilUsername.error = getString(R.string.invalid_login)
        }))

        loginViewModel.addDisposable(loginViewModel.getLoginObservable().subscribeBy(onNext = {
            if (it){
                val intent = Intent(this, ChatActivity::class.java)
                startActivity(intent)
                finish()
            }
            else{
                loginContainer.visibility = View.VISIBLE
                progressBar.visibility = View.GONE
                Toast.makeText(this, getString(R.string.cannot_login), Toast.LENGTH_LONG).show()
            }
        }))

        loginViewModel.addDisposable(loginViewModel.getLoadingObservable().subscribeBy(onNext = {
            if (it){
                loginContainer.visibility = View.GONE
                progressBar.visibility = View.VISIBLE
            }
        }))
    }
}
