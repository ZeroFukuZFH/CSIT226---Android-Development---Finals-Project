package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class RegisterActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val editTextEmail = findViewById<EditText>(R.id.edittextEmail)
        val editTextUserName = findViewById<EditText>(R.id.edittextUsername)
        val editTextPassword = findViewById<EditText>(R.id.edittextPassword)
        val editTextConfirmPassword = findViewById<EditText>(R.id.edittextConfirmPassword)
        val buttonRegister = findViewById<Button>(R.id.buttonRegister)
        val textViewLoginActivity = findViewById<TextView>(R.id.textViewLoginActivity)

        // AUTH
        buttonRegister.setOnClickListener {
            // TODO : POST TO DATABASE
            val dashboardActivity = Intent(this,DashboardActivity::class.java)
            startActivity(dashboardActivity)
            // TODO : AUTHENTICATE
        }

        // ROUTING
        textViewLoginActivity.setOnClickListener {
            val loginActivity = Intent(this,LoginActivity::class.java)
            startActivity(loginActivity)
        }
    }
}