package com.example.adornado_activity3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.adornado_activity3.databinding.FragmentCelsiusToFarenheitBinding

class CelsiusToFahrenheit : Fragment() {
    private lateinit var binding: FragmentCelsiusToFarenheitBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCelsiusToFarenheitBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button2.setOnClickListener {
            val inputValue = binding.InputCelFahr.editText?.text.toString().toDoubleOrNull()
            if (inputValue != null) {
                val celsiusValue = (inputValue * 9 / 5) + 32
                val formattedCelsiusValue = String.format("%.2f", celsiusValue)
                binding.result = "$formattedCelsiusValue°F"
            } else {
                binding.result = "0"
            }
        }


        binding.button3.setOnClickListener {
            val inputValue = binding.InputCelFahr.editText?.text.toString().toDoubleOrNull()
            if (inputValue != null) {
                val fahrenheitValue = (inputValue - 32) * 5 / 9
                val formattedFahrenheitValue = String.format("%.2f", fahrenheitValue)
                binding.result = "$formattedFahrenheitValue°C"
            } else {
                binding.result = "0"
            }
        }
    }

    companion object {
        // Coming soon
    }
}
