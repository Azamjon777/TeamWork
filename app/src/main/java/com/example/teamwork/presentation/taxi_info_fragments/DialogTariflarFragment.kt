package com.example.teamwork.presentation.taxi_info_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.DialogFragment
import com.example.teamwork.R

class DialogTariflarFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_tariflar_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val exitImg = view.findViewById<ImageView>(R.id.dialog_tariflar_exit)
        val btnOk = view.findViewById<Button>(R.id.dialog_tariflar_btn_ok)
        exitImg.setOnClickListener {
            dismiss()
        }
        btnOk.setOnClickListener {
            dismiss()
        }
    }
}