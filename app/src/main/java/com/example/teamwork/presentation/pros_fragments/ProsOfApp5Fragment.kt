package com.example.teamwork.presentation.pros_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.teamwork.R
import com.example.teamwork.databinding.FragmentProsOfApp5Binding

class ProsOfApp5Fragment : Fragment() {
    private var _binding: FragmentProsOfApp5Binding? = null
    private val binding: FragmentProsOfApp5Binding
        get() = _binding ?: throw RuntimeException("FragmentProsOfApp5Binding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProsOfApp5Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextToProsOfApp6.setOnClickListener {
            findNavController().navigate(R.id.action_prosOfApp5Fragment_to_prosOfApp6Fragment)
        }
        binding.previousToProsOfApp4.setOnClickListener {
            findNavController().navigate(R.id.action_prosOfApp5Fragment_to_prosOfApp4Fragment)
        }
        binding.skipTextPros5.setOnClickListener {
            findNavController().navigate(R.id.action_prosOfApp5Fragment_to_registerFragment2)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}