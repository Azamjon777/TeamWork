package com.example.teamwork.presentation.register_fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.teamwork.R
import com.example.teamwork.databinding.FragmentRegister2Binding
import com.example.teamwork.presentation.MyViewModel

class RegisterFragment2 : Fragment() {
    private var _binding: FragmentRegister2Binding? = null
    private val binding: FragmentRegister2Binding
        get() = _binding ?: throw RuntimeException("FragmentRegister2Binding == null")

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
        _binding = FragmentRegister2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = viewLifecycleOwner
        addTextChangeListeners()
        binding.btnNextReg2.setOnClickListener {
            val phone = binding.etPhoneNumber.text.toString()
            if (viewModel.validateInputPhone(phone)) {
                findNavController().navigate(R.id.action_registerFragment2_to_registerFragment3)
            } else {
                binding.tilPhoneNumber.error = "To'liq notog'ri kiritilmagan"
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun addTextChangeListeners() {
        binding.etPhoneNumber.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                viewModel.resetErrorInputName()
            }

            override fun afterTextChanged(s: Editable?) {
            }
        })
    }
}