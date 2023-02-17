package com.example.teamwork.presentation.register_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.teamwork.R
import com.example.teamwork.databinding.FragmentRegister2Binding

class RegisterFragment2 : Fragment() {
    private var _binding: FragmentRegister2Binding? = null
    private val binding: FragmentRegister2Binding
        get() = _binding ?: throw RuntimeException("FragmentRegister2Binding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegister2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNextReg2.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment2_to_registerFragment3)
        }
    }
}