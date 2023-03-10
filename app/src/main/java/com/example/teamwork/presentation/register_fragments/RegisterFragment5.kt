package com.example.teamwork.presentation.register_fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.teamwork.databinding.FragmentRegister5Binding
import com.example.teamwork.presentation.activities.Login1Activity
import com.example.teamwork.presentation.MyViewModel

class RegisterFragment5 : Fragment() {
    private var _binding: FragmentRegister5Binding? = null
    private val binding: FragmentRegister5Binding
        get() = _binding ?: throw RuntimeException("FragmentRegister5Binding == null")

    private val viewModel: MyViewModel by lazy {
        ViewModelProvider(
            this,
            ViewModelProvider.AndroidViewModelFactory(requireActivity().application)
        )[MyViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegister5Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.btnNextReg5.setOnClickListener {
            val textPassword = binding.etPassword.text.toString()
            val textConfirmPassword = binding.etConfirmPassword.text.toString()
            if (viewModel.validatePassword(textPassword, textConfirmPassword)) {
                val intent = Intent(activity, Login1Activity::class.java)
                startActivity(intent)
                activity?.finish()
            } else {
                binding.tilPassword.error = "Parollar bir xil emas"
                binding.tilConfirmPassword.error = "Parollar bir xil emas"
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}