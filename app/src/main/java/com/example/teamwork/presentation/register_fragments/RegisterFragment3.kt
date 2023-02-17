package com.example.teamwork.presentation.register_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.teamwork.R
import com.example.teamwork.databinding.FragmentRegister3Binding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class RegisterFragment3 : Fragment() {
    private var _binding: FragmentRegister3Binding? = null
    private val binding: FragmentRegister3Binding
        get() = _binding ?: throw RuntimeException("FragmentRegister3Binding == null")

    private var time = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegister3Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lifecycleScope.launch {
            binding.textTimer.text = timer()
        }
        binding.btnNextReg3.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment3_to_registerFragment4)
        }
    }

    private suspend fun timer(): String {
        delay(1000)
        return time++.toString()
    }
}