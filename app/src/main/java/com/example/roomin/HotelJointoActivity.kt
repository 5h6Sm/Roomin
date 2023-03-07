package com.example.roomin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.roomin.databinding.ActivityHotelJointoBinding

class HotelJointoActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityHotelJointoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHotelJointoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btn = findViewById<AppCompatButton>(R.id.servise)
        btn.setOnClickListener{
            val intent = Intent(this, UseMoneyActivity::class.java)
            startActivity(intent)
        }
    }
}