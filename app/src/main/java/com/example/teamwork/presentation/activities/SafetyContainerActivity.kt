package com.example.teamwork.presentation.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.teamwork.R

class SafetyContainerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_safety_container)
        supportActionBar?.hide()
    }
}