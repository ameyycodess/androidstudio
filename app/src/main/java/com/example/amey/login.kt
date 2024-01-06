package com.example.amey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val login_btn = findViewById<Button>(R.id.login)
        login_btn.setOnClickListener {
            val login_btn = Intent(this, logsuc::class.java)
            startActivity(login_btn)
        }
    }
}