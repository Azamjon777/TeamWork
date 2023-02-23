package com.example.teamwork.presentation.taxi_info_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModelProvider
import com.example.teamwork.R
import com.example.teamwork.databinding.FragmentGoToLineBinding
import com.example.teamwork.databinding.FragmentYolovchiQoshishDialogBinding
import com.example.teamwork.presentation.MyViewModel

class YolovchiQoshishDialogFragment : DialogFragment() {
    private var _binding: FragmentYolovchiQoshishDialogBinding? = null
    private val binding: FragmentYolovchiQoshishDialogBinding
        get() = _binding ?: throw RuntimeException("FragmentYolovchiQoshishDialogBinding == null")

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
        _binding = FragmentYolovchiQoshishDialogBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        val exit = view.findViewById<ImageView>(R.id.img_exit_yolovchi_qoshish)
        val addYolovchi = view.findViewById<CardView>(R.id.card_qoshish)
        val back = view.findViewById<CardView>(R.id.card_bekor_qilish)

        exit.setOnClickListener {
            dismiss()
        }

        back.setOnClickListener {
            dismiss()
        }

        addYolovchi.setOnClickListener {
            viewModel.textBoshOrBand.value = "Band"
            dismiss()
        }
    }
}