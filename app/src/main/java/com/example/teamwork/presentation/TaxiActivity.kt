package com.example.teamwork.presentation

import android.os.Bundle
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.teamwork.R
import com.example.teamwork.databinding.ActivityTaxiBinding

class TaxiActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTaxiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTaxiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.goToLinePopup.setOnClickListener { it ->
            val popup = PopupMenu(this, it)
            popup.inflate(R.menu.test)
            popup.setOnMenuItemClickListener {
                Toast.makeText(this, "it $it", Toast.LENGTH_SHORT).show()
                true
            }
            popup.show()
        }
    }
}