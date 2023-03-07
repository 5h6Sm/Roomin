package com.example.roomin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val btn = findViewById<ImageButton>(R.id.startbtn)
        btn.setOnClickListener{
            val intent = Intent(this, SignPage::class.java)
            startActivity(intent)
        }

    }
}