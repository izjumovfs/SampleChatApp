package com.example.chatapp.data.manager

import android.content.Context
import android.content.SharedPreferences
import com.example.chatapp.util.PREFS_NAME
import com.example.chatapp.util.PREF_MEMBER_DATA
import com.example.chatapp.util.PREF_TOKEN
import com.example.communication.data.MemberData
import com.google.gson.Gson

class PrefsManager(private val context: Context){

    private val sharedPrefs: SharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    fun isAuthorized(): Boolean = sharedPrefs.contains(PREF_MEMBER_DATA)

    fun saveUser(token: String, memberData: MemberData){
        val editor = sharedPrefs.edit()
        editor.putString(PREF_TOKEN, token)

        val gson = Gson()
        editor.putString(PREF_MEMBER_DATA, gson.toJson(memberData))

        editor.apply()
    }

    fun getToken(): String = sharedPrefs.getString(PREF_TOKEN, null)

    fun getMemberData(): MemberData{
        val gson = Gson()
        return gson.fromJson(sharedPrefs.getString(PREF_MEMBER_DATA, ""), MemberData::class.java)
    }
}