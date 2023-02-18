package com.example.teamwork.presentation.pros_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.teamwork.R
import com.example.teamwork.databinding.FragmentProsOfApp3Binding

class ProsOfApp3Fragment : Fragment() {
    private var _binding: FragmentProsOfApp3Binding? = null
    private val binding: FragmentProsOfApp3Binding
        get() = _binding ?: throw RuntimeException("FragmentProsOfApp3Binding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProsOfApp3Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextToProsOfApp4.setOnClickListener {
            findNavController().navigate(R.id.action_prosOfApp3Fragment_to_prosOfApp4Fragment)
        }

        binding.previousToProsOfApp2.setOnClickListener {
            findNavController().navigate(R.id.action_prosOfApp3Fragment_to_prosOfApp2Fragment)
        }
        binding.skipTextPros3.setOnClickListener {
            findNavController().navigate(R.id.action_prosOfApp3Fragment_to_registerFragment2)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}