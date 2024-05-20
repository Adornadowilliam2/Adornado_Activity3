package com.example.adornado_activity3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.adornado_activity3.databinding.FragmentPhpToUsdBinding

class PhpToUsd : Fragment() {

    lateinit var binding: FragmentPhpToUsdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPhpToUsdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button2.setOnClickListener {
            val phpAmount = binding.InputPhpUsd.editText?.text.toString().toDoubleOrNull()
            if (phpAmount != null) {
                val exchangeRate = 0.018
                val usdAmount = phpAmount * exchangeRate
                val formattedUsdAmount = String.format("%.2f", usdAmount)
                binding.result = "$$formattedUsdAmount"
            } else {
                binding.result = "0"
            }
        }


        binding.button3.setOnClickListener {
            val usdAmount = binding.InputPhpUsd.editText?.text.toString().toDoubleOrNull()
            if (usdAmount != null) {
                val exchangeRate = 56.59
                val phpAmount = usdAmount * exchangeRate
                val formattedPhpAmount = String.format("%.2f", phpAmount)
                binding.result = "₱$formattedPhpAmount"
            } else {
                binding.result = "0"
            }
        }
    }

    companion object {
        // Coming soon
    }
}
