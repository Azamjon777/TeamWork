package com.example.teamwork.presentation

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.teamwork.databinding.ActivityTaxiBinding
import com.example.teamwork.presentation.taxi_info_fragments.DialogOrderDetailsFragment

class TaxiActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTaxiBinding
    private var backPressedTime: Long = 0

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

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            return super.onBackPressed()
        } else {
            Toast.makeText(this, "Chiqish uchun yana bosing", Toast.LENGTH_SHORT).show()
        }
        backPressedTime = System.currentTimeMillis()
    }
}