package com.example.explicit_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var tv : TextView
    lateinit var tv3 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        tv =findViewById(R.id.textView2)
        tv3 = findViewById(R.id.textView3)

        val email = intent.getStringExtra("Email")
        val password = intent.getStringExtra("Password")

        tv.text = email.toString()
        tv3.text = password.toString()

    }
}