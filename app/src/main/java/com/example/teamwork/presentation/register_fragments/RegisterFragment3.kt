package com.example.teamwork.presentation.register_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.teamwork.R
import com.example.teamwork.databinding.FragmentRegister3Binding
import com.example.teamwork.presentation.MyViewModel

class RegisterFragment3 : Fragment() {
    private var _binding: FragmentRegister3Binding? = null
    private val binding: FragmentRegister3Binding
        get() = _binding ?: throw RuntimeException("FragmentRegister3Binding == null")

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
        _binding = FragmentRegister3Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        viewModel.startTimer()

        binding.btnNextReg3.setOnClickListener {
            val code = binding.etCode.text.toString()
            if (viewModel.validateCode(code)) {
                findNavController().navigate(R.id.action_registerFragment3_to_registerFragment4)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}