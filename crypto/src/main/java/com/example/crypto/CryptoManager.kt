package com.example.crypto

import android.annotation.SuppressLint
import android.annotation.TargetApi
import android.util.Base64
import javax.crypto.Cipher
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec


class CryptoManager{

    @TargetApi(8)
    @Throws(Exception::class)
    fun encryptData(text: String): String {

        val cipher = Cipher.getInstance("AES/CBC/PKCS7Padding")
        val static_key = AES_KEY.toByteArray()

        val keySpec = SecretKeySpec(static_key, "AES")
        val ivSpec = IvParameterSpec(IV_VECTOR)
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec)

        val results = cipher.doFinal(text.toByteArray())

        return Base64.encodeToString(results, Base64.NO_WRAP or Base64.DEFAULT)

    }

    @SuppressLint("NewApi")
    @Throws(Exception::class)
    fun decryptData(text: String): String {

        val encryted_bytes = Base64.decode(text, Base64.DEFAULT)

        val cipher = Cipher.getInstance("AES/CBC/PKCS7Padding")
        val static_key = AES_KEY.toByteArray()

        val keySpec = SecretKeySpec(static_key, "AES")
        val ivSpec = IvParameterSpec(IV_VECTOR)
        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec)

        val decrypted = cipher.doFinal(encryted_bytes)

        return String(decrypted)
    }
}