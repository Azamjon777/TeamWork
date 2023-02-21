package com.example.teamwork.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.teamwork.R
import com.example.teamwork.presentation.taxi_info_fragments.DialogOrderDetailsFragment

class TaxiContainerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_taxi_container)
        supportActionBar?.hide()
        val dialogFragment = DialogOrderDetailsFragment()
        dialogFragment.show(supportFragmentManager, "CustomDialog")
    }
}