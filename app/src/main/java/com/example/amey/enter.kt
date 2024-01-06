package com.example.amey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class press : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter)

        val int_btn = findViewById<Button>(R.id.int_btn)
        int_btn.setOnClickListener {
            val int_btn = Intent(this, MainActivity::class.java)
            startActivity(int_btn)
        }
    }
}