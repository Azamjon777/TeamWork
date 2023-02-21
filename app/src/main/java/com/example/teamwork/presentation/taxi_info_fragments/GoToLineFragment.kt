package com.example.teamwork.presentation.taxi_info_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.teamwork.R
import com.example.teamwork.databinding.FragmentGoToLineBinding

class GoToLineFragment : Fragment() {
    private var _binding: FragmentGoToLineBinding? = null
    private val binding: FragmentGoToLineBinding
        get() = _binding ?: throw RuntimeException("FragmentGoToLineBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGoToLineBinding.inflate(inflater, container, false)
        return binding.root
    }

}