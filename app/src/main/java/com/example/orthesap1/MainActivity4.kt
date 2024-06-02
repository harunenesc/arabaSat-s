package com.example.orthesap1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.orthesap1.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    lateinit var binding: ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        val sayfadort = binding.root
        setContentView(sayfadort)

        binding.geri.setOnClickListener {
            val sayfabir = Intent(applicationContext, MainActivity::class.java)
            startActivity(sayfabir)
        }
    }
}