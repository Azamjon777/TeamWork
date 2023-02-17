package com.example.teamwork.presentation.pros_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.teamwork.R
import com.example.teamwork.databinding.FragmentProsOfApp6Binding

class ProsOfApp6Fragment : Fragment() {
    private var _binding: FragmentProsOfApp6Binding? = null
    private val binding: FragmentProsOfApp6Binding
        get() = _binding ?: throw RuntimeException("FragmentProsOfApp6Binding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProsOfApp6Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextToProsOfApp7.setOnClickListener {
            findNavController().navigate(R.id.action_prosOfApp6Fragment_to_prosOfApp7Fragment)
        }

        binding.previousToProsOfApp5.setOnClickListener {
            findNavController().navigate(R.id.action_prosOfApp6Fragment_to_prosOfApp5Fragment)
        }

        binding.skipTextPros6.setOnClickListener {
            findNavController().navigate(R.id.action_prosOfApp6Fragment_to_registerFragment1)
        }
    }
}