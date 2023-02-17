package com.example.teamwork.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teamwork.R

class ProsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pros)
        supportActionBar?.hide()
    }
}