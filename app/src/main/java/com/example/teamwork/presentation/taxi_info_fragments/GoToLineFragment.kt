package com.example.teamwork.presentation.taxi_info_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.teamwork.R
import com.example.teamwork.databinding.FragmentGoToLineBinding
import com.example.teamwork.presentation.MyViewModel

class GoToLineFragment : Fragment() {
    private var _binding: FragmentGoToLineBinding? = null
    private val binding: FragmentGoToLineBinding
        get() = _binding ?: throw RuntimeException("FragmentGoToLineBinding == null")

    private val viewModel: MyViewModel by lazy {
        ViewModelProvider(
            this,
            ViewModelProvider.AndroidViewModelFactory(requireActivity().application)
        )[MyViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGoToLineBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        clicks()
    }

    private fun clicks() {
        binding.imgBack.setOnClickListener {
            activity?.finish()
        }

        binding.cardYunalishdanChiqish.setOnClickListener {
            val dialogFragment = DialogYunalishdanChiqishFragment()
            dialogFragment.show(requireActivity().supportFragmentManager, "CustomDialog")
        }

        binding.menuZakazlar.setOnClickListener {
            findNavController().navigate(R.id.action_goToLineFragment2_to_zakazlarFragment)
        }

        binding.firstCardBosh.setOnClickListener {
            if (viewModel.textBoshOrBand.value == "Band") {
                val dialogFragment = YolovchiMalumotiDialogFragment()
                dialogFragment.show(requireActivity().supportFragmentManager, "CustomDialog")
            } else if (viewModel.textBoshOrBand.value == "Bo'sh") {
                val dialogFragment = YolovchiQoshishDialogFragment()
                dialogFragment.show(requireActivity().supportFragmentManager, "CustomDialog")
            }
        }

        binding.secondCardBosh.setOnClickListener {
            if (viewModel.textBoshOrBand.value == "Band") {
                val dialogFragment = YolovchiMalumotiDialogFragment()
                dialogFragment.show(requireActivity().supportFragmentManager, "CustomDialog")
            } else if (viewModel.textBoshOrBand.value == "Bo'sh") {
                val dialogFragment = YolovchiQoshishDialogFragment()
                dialogFragment.show(requireActivity().supportFragmentManager, "CustomDialog")
            }
        }

        binding.thirdCardBosh.setOnClickListener {
            if (viewModel.textBoshOrBand.value == "Band") {
                val dialogFragment = YolovchiMalumotiDialogFragment()
                dialogFragment.show(requireActivity().supportFragmentManager, "CustomDialog")
            } else if (viewModel.textBoshOrBand.value == "Bo'sh") {
                val dialogFragment = YolovchiQoshishDialogFragment()
                dialogFragment.show(requireActivity().supportFragmentManager, "CustomDialog")
            }
        }

        binding.fourthCardBosh.setOnClickListener {
            if (viewModel.textBoshOrBand.value == "Band") {
                val dialogFragment = YolovchiMalumotiDialogFragment()
                dialogFragment.show(requireActivity().supportFragmentManager, "CustomDialog")
            } else if (viewModel.textBoshOrBand.value == "Bo'sh") {
                val dialogFragment = YolovchiQoshishDialogFragment()
                dialogFragment.show(requireActivity().supportFragmentManager, "CustomDialog")
            }
        }
    }
}