package com.example.teamwork.presentation.taxi_info_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.teamwork.R
import com.example.teamwork.presentation.MyViewModel

class YolovchiMalumotiDialogFragment : DialogFragment() {
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
        return inflater.inflate(R.layout.fragment_yolovchi_malumoti_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val exit = view.findViewById<ImageView>(R.id.img_exit_from_dialog)
        val cancel = view.findViewById<CardView>(R.id.bekor_qilish_dialog)
        val olibTashlash = view.findViewById<CardView>(R.id.olib_tashlash)

        olibTashlash.setOnClickListener {
            viewModel.colorOfCircle.value = R.color.green
            dismiss()
        }

        cancel.setOnClickListener {
            dismiss()
        }

        exit.setOnClickListener {
            dismiss()
        }
    }
}