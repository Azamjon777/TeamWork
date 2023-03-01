package com.example.teamwork.presentation.taxi_info_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.teamwork.databinding.FragmentSafety1Binding

class Safety1Fragment : Fragment() {
    private var _binding: FragmentSafety1Binding? = null
    private val binding: FragmentSafety1Binding
        get() = _binding ?: throw RuntimeException("FragmentSafety1Binding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSafety1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        clicks()
    }

    private fun clicks() {
        val exit = binding.safetyBackImg
        val ambulance = binding.safetyCardAmbulance
        val emergency = binding.safetyCardEmergency
        val contacts = binding.safetyCardContacts

        exit.setOnClickListener {
            requireActivity().finish()
        }

        ambulance.setOnClickListener {
            Toast.makeText(requireActivity(), "ambulance", Toast.LENGTH_SHORT).show()
        }

        emergency.setOnClickListener {
            Toast.makeText(requireActivity(), "emergency", Toast.LENGTH_SHORT).show()
        }

        contacts.setOnClickListener {
            Toast.makeText(requireActivity(), "contacts", Toast.LENGTH_SHORT).show()
        }
    }
}