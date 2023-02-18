package com.example.teamwork.presentation.pros_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.teamwork.R
import com.example.teamwork.databinding.FragmentProsOfApp2Binding

class ProsOfApp2Fragment : Fragment() {
    private var _binding: FragmentProsOfApp2Binding? = null
    private val binding: FragmentProsOfApp2Binding
        get() = _binding ?: throw RuntimeException("FragmentProsOfApp2Binding == null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProsOfApp2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextToProsOfApp3.setOnClickListener {
            findNavController().navigate(R.id.action_prosOfApp2Fragment_to_prosOfApp3Fragment)
        }

        binding.previousToProsOfApp1.setOnClickListener {
            findNavController().navigate(R.id.action_prosOfApp2Fragment_to_prosOfApp1Fragment)
        }
        binding.skipTextPros2.setOnClickListener {
            findNavController().navigate(R.id.action_prosOfApp2Fragment_to_registerFragment2)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}