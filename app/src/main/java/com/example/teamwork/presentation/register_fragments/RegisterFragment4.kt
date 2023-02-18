package com.example.teamwork.presentation.register_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.teamwork.R
import com.example.teamwork.databinding.FragmentRegister4Binding
import com.example.teamwork.presentation.MyViewModel

class RegisterFragment4 : Fragment() {
    private var _binding: FragmentRegister4Binding? = null
    private val binding: FragmentRegister4Binding
        get() = _binding ?: throw RuntimeException("FragmentRegister4Binding == null")

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
        _binding = FragmentRegister4Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = viewLifecycleOwner

        binding.btnNextReg4.setOnClickListener {
            val name = binding.etFirstName.text.toString()
            val secondName = binding.etSecondName.text.toString()

            if (viewModel.validateNameSurname(name, secondName)) {
                findNavController().navigate(R.id.action_registerFragment4_to_registerFragment5)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}