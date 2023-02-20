package com.example.teamwork.presentation.taxi_info_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.teamwork.R

class DialogOrderDetailsFragment : DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_dialog_order_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rGroup = view.findViewById<RadioGroup>(R.id.radio_group_choose)
        val btn = view.findViewById<Button>(R.id.btn_order_go_to_line)
        btn.setOnClickListener {
            val selectBtn = rGroup.checkedRadioButtonId
            val btnCheckBox = view.findViewById<RadioButton>(selectBtn)
            Toast.makeText(activity, "$btnCheckBox", Toast.LENGTH_SHORT).show()
        }
    }
}