package com.danielbrauer.instead

import android.util.Log

class Client {

    suspend fun derivePrivateKey(salt: String, password: String, secretKey: String, username: String) {
        
    }

    fun startLogin(username: String, password: String, secretKey: String) {
        Log.d("TAG", "startLogin: Beginning login")

    }
}