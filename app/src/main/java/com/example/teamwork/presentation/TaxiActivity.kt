package com.example.teamwork.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.teamwork.presentation.taxi_info_fragments.DialogOrderDetailsFragment
import com.example.teamwork.databinding.ActivityTaxiBinding

class TaxiActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTaxiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTaxiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.goToLinePopup.setOnClickListener {
            val dialogFragment = DialogOrderDetailsFragment()
            dialogFragment.show(supportFragmentManager, "CustomDialog")
        }
    }
}