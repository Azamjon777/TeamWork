package com.example.teamwork.presentation.pros_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.teamwork.R
import com.example.teamwork.databinding.FragmentProsOfApp4Binding

class ProsOfApp4Fragment : Fragment() {
    private var _binding: FragmentProsOfApp4Binding? = null
    private val binding: FragmentProsOfApp4Binding
        get() = _binding ?: throw RuntimeException("FragmentProsOfApp4Binding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProsOfApp4Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextToProsOfApp5.setOnClickListener {
            findNavController().navigate(R.id.action_prosOfApp4Fragment_to_prosOfApp5Fragment)
        }

        binding.previousToProsOfApp3.setOnClickListener {
            findNavController().navigate(R.id.action_prosOfApp4Fragment_to_prosOfApp3Fragment)
        }

        binding.skipTextPros4.setOnClickListener {
            findNavController().navigate(R.id.action_prosOfApp4Fragment_to_registerFragment1)
        }
    }
}