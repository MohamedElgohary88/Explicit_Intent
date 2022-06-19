package com.example.explicit_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var emailEt: EditText
    lateinit var passwordEt: EditText
    lateinit var loginBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        emailEt = findViewById(R.id.email)
        passwordEt = findViewById(R.id.password)
        loginBtn = findViewById(R.id.login)

        val email = emailEt.text.toString()
        val password = passwordEt.text.toString()

        loginBtn.setOnClickListener {

            if (email.isEmpty() && password.isEmpty()) {
                emailEt.error = "This field is required"
                passwordEt.error = "This field is required"
            } else {
                val i = Intent(this, SecondActivity::class.java)
                i.putExtra("Email", email)
                i.putExtra("Password", password)
                startActivity(i)
            }
        }
    }
}