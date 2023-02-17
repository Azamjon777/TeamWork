package com.example.teamwork.presentation.register_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.teamwork.databinding.FragmentRegister5Binding

class RegisterFragment5 : Fragment() {
    private var _binding: FragmentRegister5Binding? = null
    private val binding: FragmentRegister5Binding
        get() = _binding ?: throw RuntimeException("FragmentRegister5Binding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegister5Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNextReg5.setOnClickListener {
            //TODO
        }
    }
}