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
import com.example.teamwork.presentation.MyViewModel

class YolovchiQoshishDialogFragment : DialogFragment() {
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
        return inflater.inflate(R.layout.fragment_yolovchi_qoshish_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val exit = view.findViewById<ImageView>(R.id.img_exit)
        exit.setOnClickListener {
            dismiss()
        }

        val addYolovchi = view.findViewById<CardView>(R.id.card_qoshish)
        addYolovchi.setOnClickListener {
            viewModel.colorOfCircle.value = R.color.yellow
            val a = R.color.yellow
            dismiss()
        }
    }
}