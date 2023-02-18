package com.example.teamwork.presentation.pros_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.teamwork.R
import com.example.teamwork.databinding.FragmentProsOfApp7Binding

class ProsOfApp7Fragment : Fragment() {
    private var _binding: FragmentProsOfApp7Binding? = null
    private val binding: FragmentProsOfApp7Binding
        get() = _binding ?: throw RuntimeException("FragmentProsOfApp7Binding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProsOfApp7Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextToRegister.setOnClickListener {
            findNavController().navigate(R.id.action_prosOfApp7Fragment_to_registerFragment2)
        }
        binding.previousToProsOfApp6.setOnClickListener {
            findNavController().navigate(R.id.action_prosOfApp7Fragment_to_prosOfApp6Fragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}