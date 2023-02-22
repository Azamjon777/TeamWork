package com.example.teamwork.presentation.taxi_info_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.fragment.app.DialogFragment
import com.example.teamwork.R

class DialogYunalishdanChiqishFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_dialog_yunalishdan_chiqish, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val exit = view.findViewById<ImageView>(R.id.img_exit)
        val backBtn = view.findViewById<Button>(R.id.btn_orqaga_qaytish)

        backBtn.setOnClickListener {
            dismiss()
        }

        exit.setOnClickListener {
            dismiss()
        }

    }
}