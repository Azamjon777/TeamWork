package com.example.teamwork.presentation.pros_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.teamwork.R
import com.example.teamwork.databinding.FragmentChooseLanguageBinding

class ChooseLanguageFragment : Fragment() {

    private var _binding: FragmentChooseLanguageBinding? = null
    private val binding: FragmentChooseLanguageBinding
        get() = _binding ?: throw RuntimeException("FragmentChooseLanguageBinding == null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChooseLanguageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnRusDisabled.setOnClickListener {
            it.visibility = View.GONE
            binding.btnRusEnabled.visibility = View.VISIBLE
            chooseLanguageFragmentToPros()
        }

        binding.btnUzbDisabled.setOnClickListener {
            it.visibility = View.GONE
            binding.btnUzbEnabled.visibility = View.VISIBLE
            chooseLanguageFragmentToPros()
        }

        binding.btnEngDisabled.setOnClickListener {
            it.visibility = View.GONE
            binding.btnEngEnabled.visibility = View.VISIBLE
            chooseLanguageFragmentToPros()
        }
    }

    private fun chooseLanguageFragmentToPros() {
        findNavController().navigate(R.id.action_chooseLanguageFragment_to_prosOfApp1Fragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}