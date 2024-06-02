package com.example.orthesap1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.orthesap1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        val sayfam = binding.root
        setContentView(sayfam)

        binding.b1.setOnClickListener {
            val ikincisayfa = Intent(applicationContext, MainActivity2::class.java)
            startActivity(ikincisayfa)
        }
        binding.b2.setOnClickListener {
            val sayfauc = Intent(applicationContext, MainActivity3::class.java)
            startActivity(sayfauc)
        }
        binding.b3.setOnClickListener {
            val sayfadort = Intent(applicationContext, MainActivity4::class.java)
            startActivity(sayfadort)
        }
        binding.b4.setOnClickListener {
            val sayfabes = Intent(applicationContext, MainActivity5::class.java)
            startActivity(sayfabes)
        }
    }
}


