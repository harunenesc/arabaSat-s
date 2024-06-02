package com.example.orthesap1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.orthesap1.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain2Binding.inflate(layoutInflater)
        val sayfaiki=binding.root
        setContentView(sayfaiki)

        binding.geri.setOnClickListener {
            val sayfabir = Intent(applicationContext, MainActivity::class.java)
            startActivity(sayfabir)
        }
    }
}