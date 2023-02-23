package com.example.teamwork.presentation.taxi_info_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.teamwork.R
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

        val exit = view.findViewById<ImageView>(R.id.img_back_zakaz)
        exit.setOnClickListener {
            findNavController().navigate(R.id.action_zakazlarFragment_to_goToLineFragment2)
        }
    }
}