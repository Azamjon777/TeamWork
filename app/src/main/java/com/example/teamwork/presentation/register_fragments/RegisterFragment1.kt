package com.example.teamwork.presentation.register_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.teamwork.R
import com.example.teamwork.databinding.FragmentRegister1Binding

class RegisterFragment1 : Fragment() {
    private var _binding: FragmentRegister1Binding? = null
    private val binding: FragmentRegister1Binding
        get() = _binding ?: throw RuntimeException("FragmentRegister1Binding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegister1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNextReg1.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment1_to_registerFragment2)
        }
    }
}