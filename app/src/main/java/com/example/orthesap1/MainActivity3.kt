package com.example.orthesap1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.orthesap1.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        val sayfauc=binding.root
        setContentView(sayfauc)

        binding.geri.setOnClickListener {
            val sayfabir = Intent(applicationContext, MainActivity::class.java)
            startActivity(sayfabir)
        }
    }
}