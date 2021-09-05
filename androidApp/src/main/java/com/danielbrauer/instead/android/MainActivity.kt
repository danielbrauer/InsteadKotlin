package com.danielbrauer.instead.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.danielbrauer.instead.Greeting
import android.widget.TextView
import android.widget.Button
import android.widget.EditText
import com.danielbrauer.instead.Client


fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()

        val usernameField: EditText = findViewById(R.id.username)
        val passwordField: EditText = findViewById(R.id.password)
        val secretKeyField: EditText = findViewById(R.id.secretKey)
        val button: Button = findViewById(R.id.login)
        button.setOnClickListener() {
            val client = Client()
            client.startLogin(usernameField.text.toString(), passwordField.text.toString(), secretKeyField.text.toString())
        }
    }
}
