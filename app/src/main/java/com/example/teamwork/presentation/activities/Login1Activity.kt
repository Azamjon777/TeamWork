package com.example.teamwork.presentation.activities

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.example.teamwork.R
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices

class Login1Activity : AppCompatActivity() {
    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login1)

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)

        fetchLocation()
        startActivity(Intent(this, TaxiActivity::class.java))
    }

    private fun fetchLocation() {
        val task = fusedLocationProviderClient.lastLocation

        if (ActivityCompat.checkSelfPermission(
                this, android.Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                this, android.Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),
                101
            )
            return
        }
        task.addOnSuccessListener {
            if (it != null) {
                Toast.makeText(this, "${it.latitude} ${it.longitude}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}