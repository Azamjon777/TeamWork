package com.example.teamwork.presentation.taxi_info_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.teamwork.databinding.FragmentZakazlarBinding

class ZakazlarFragment : Fragment() {
    private var _binding: FragmentZakazlarBinding? = null
    private val binding: FragmentZakazlarBinding
        get() = _binding ?: throw RuntimeException("FragmentZakazlarBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentZakazlarBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}