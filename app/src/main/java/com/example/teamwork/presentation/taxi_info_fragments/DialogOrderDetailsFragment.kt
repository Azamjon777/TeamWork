package com.example.teamwork.presentation.taxi_info_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import com.example.teamwork.R


class DialogOrderDetailsFragment : DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(
            com.example.teamwork.R.layout.fragment_dialog_order_details,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rGroup = view.findViewById<RadioGroup>(com.example.teamwork.R.id.radio_group_choose)
        val btnGoToLine = view.findViewById<Button>(com.example.teamwork.R.id.btn_go_to_line)
        btnGoToLine.setOnClickListener {
            val selectBtn = rGroup.checkedRadioButtonId
            val btnCheckBox = view.findViewById<RadioButton>(selectBtn)//логика для отправки данных

            findNavController().navigate(R.id.action_dialogOrderDetailsFragment2_to_goToLineFragment2)
        }
    }
}