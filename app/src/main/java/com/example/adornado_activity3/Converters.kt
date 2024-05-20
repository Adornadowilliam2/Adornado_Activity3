package com.example.adornado_activity3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.adornado_activity3.databinding.FragmentConvertersBinding

class Converters : Fragment() {
    private lateinit var binding : FragmentConvertersBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentConvertersBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCelToFahren.setOnClickListener {
            it.findNavController().navigate(ConvertersDirections.actionConvertersToCelsiusToFarenheit())
        }

        binding.btnInchToCent.setOnClickListener {
            it.findNavController().navigate(ConvertersDirections.actionConvertersToInchToCentimeter2())
        }

        binding.btnPHPToUSD.setOnClickListener{
            it.findNavController().navigate(ConvertersDirections.actionConvertersToPhpToUsd())
        }
    }

    companion object {
    //coming soon
    }
}