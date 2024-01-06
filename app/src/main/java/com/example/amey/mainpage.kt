package com.example.amey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ph_btn = findViewById<Button>(R.id.ph)
        ph_btn.setOnClickListener {
            Toast.makeText(this,"hello",Toast.LENGTH_LONG).show()
        }

        val log_btn = findViewById<Button>(R.id.fst)
        log_btn.setOnClickListener {
            val log_btn = Intent(this, login::class.java)
            startActivity(log_btn)
        }



    }
}