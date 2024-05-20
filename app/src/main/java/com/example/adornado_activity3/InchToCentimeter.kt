package com.example.adornado_activity3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.adornado_activity3.databinding.FragmentInchToCentimeterBinding

class InchToCentimeter : Fragment() {

    lateinit var binding: FragmentInchToCentimeterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInchToCentimeterBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button2.setOnClickListener {
            val inputValue = binding.InputIncCen.editText?.text.toString().toDoubleOrNull()
            if (inputValue != null) {
                val centimeterValue = inputValue * 2.54
                val formattedResult = String.format("%.2fcm", centimeterValue)
                binding.result = formattedResult
            }
            else {
                binding.result ="0"
            }
        }

        binding.button3.setOnClickListener {
            val inputValue = binding.InputIncCen.editText?.text.toString().toDoubleOrNull()
            if (inputValue != null) {
                val centimeterValue = inputValue/ 2.54
                val formattedResult = String.format("%.2finch/es", centimeterValue)
                binding.result = formattedResult
        } else {
                binding.result = "0"
            }
        }
    }

    companion object {
        // Coming soon
    }
}
