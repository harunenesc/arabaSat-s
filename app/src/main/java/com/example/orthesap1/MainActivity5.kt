package com.example.orthesap1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.orthesap1.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {
    lateinit var binding: ActivityMain5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain5Binding.inflate(layoutInflater)
        val sayfabes=binding.root
        setContentView(sayfabes)

        binding.geri.setOnClickListener {
            val sayfabir = Intent(applicationContext, MainActivity::class.java)
            startActivity(sayfabir)
        }
    }
}