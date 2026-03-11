package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val edittextUsername = findViewById<EditText>(R.id.edittextUsername)
        val edittextPassword = findViewById<EditText>(R.id.edittextPassword)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)
        val buttonRegisterActivity = findViewById<Button>(R.id.buttonRegisterActivity)

        // AUTHENTICATION
        buttonLogin.setOnClickListener {
            // TODO : AUTHENTICATE

        }

        // ROUTING
        buttonRegisterActivity.setOnClickListener {
            val registerActivity = Intent(this,RegisterActivity::class.java)
            startActivity(registerActivity)
        }

    }
}