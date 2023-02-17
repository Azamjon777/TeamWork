package com.example.teamwork.presentation.pros_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.teamwork.R
import com.example.teamwork.data.api.restCountriesApi
import com.example.teamwork.databinding.FragmentProsOfApp1Binding
import kotlinx.coroutines.launch

class ProsOfApp1Fragment : Fragment() {
    private var _binding: FragmentProsOfApp1Binding? = null
    private val binding: FragmentProsOfApp1Binding
        get() = _binding ?: throw RuntimeException("FragmentProsOfApp1Binding == null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProsOfApp1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //предворительно вниз пишется rus или eng...
//        lifecycleScope.launch {
//            val countries = restCountriesApi.getCountryByName("Italy")
//            val oneCountry = countries[0]
//            binding.nextToProsOfApp2.text = oneCountry.cca2.toString()
//        }
        binding.nextToProsOfApp2.setOnClickListener {
            findNavController().navigate(R.id.action_prosOfApp1Fragment_to_prosOfApp2Fragment)
        }
        binding.skipTextPros1.setOnClickListener {
            findNavController().navigate(R.id.action_prosOfApp1Fragment_to_registerFragment1)
        }
    }
}