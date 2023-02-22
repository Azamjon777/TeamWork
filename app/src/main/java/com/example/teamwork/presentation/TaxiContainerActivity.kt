package com.example.teamwork.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.teamwork.R

class TaxiContainerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_taxi_container)
        supportActionBar?.hide()
    }
}