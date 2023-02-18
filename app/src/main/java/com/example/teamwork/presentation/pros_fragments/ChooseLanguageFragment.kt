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
        binding.btnRusEnable.setOnClickListener {
            binding.btnRusEnable.visibility = View.GONE
            binding.btnRusDisable.visibility = View.VISIBLE
            chooseLanguageFragmentToPros()
        }

        //здесь можно сделать фабричный метод, чтобы код не дублировался, но потом
        binding.btnEngEnable.setOnClickListener {
            binding.btnEngEnable.visibility = View.GONE
            binding.btnEngDisable.visibility = View.VISIBLE
            chooseLanguageFragmentToPros()
        }

        binding.btnUzbEnable.setOnClickListener {
            binding.btnUzbEnable.visibility = View.GONE
            binding.btnUzbDisable.visibility = View.VISIBLE
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

    companion object {
        const val KEY_LANGUAGE = ""
    }
}