package com.example.adornado_activity3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import com.example.adornado_activity3.databinding.FragmentMoneyChangerBinding

class MoneyChanger : Fragment() {



    lateinit var binding: FragmentMoneyChangerBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMoneyChangerBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val computeButton: Button = binding.btnCompute
        val resultNum1000: TextView = binding.ResultNum1000
        val resultNum500: TextView = binding.ResultNum500
        val resultNum200: TextView = binding.ResultNum200
        val resultNum100: TextView = binding.ResultNum100
        val resultNum50: TextView = binding.ResultNum50
        val resultNum20: TextView = binding.ResultNum20
        val resultNum10: TextView = binding.ResultNum10
        val resultNum5: TextView = binding.ResultNum5
        val resultNum1: TextView = binding.ResultNum1

        // Function for the button
        computeButton.setOnClickListener {
            val inputValue = binding.InputAmount.editText?.text.toString().toDoubleOrNull()
            if (inputValue != null) {
                val amount = inputValue.toInt()

                val num1000 = amount / 1000
                val num500 = (amount % 1000) / 500
                val num200 = (amount % 500) / 200
                val num100 = (amount % 200) / 100
                val num50 = (amount % 100) / 50
                val num20 = (amount % 50) / 20
                val num10 = (amount % 20) / 10
                val num5 = (amount % 10) / 5
                val num1 = amount % 5

                resultNum1000.text = num1000.toString()
                resultNum500.text = num500.toString()
                resultNum200.text = num200.toString()
                resultNum100.text = num100.toString()
                resultNum50.text = num50.toString()
                resultNum20.text = num20.toString()
                resultNum10.text = num10.toString()
                resultNum5.text = num5.toString()
                resultNum1.text = num1.toString()
            } else {
                resultNum1000.text = "0"
                resultNum500.text = "0"
                resultNum200.text = "0"
                resultNum100.text = "0"
                resultNum50.text = "0"
                resultNum20.text = "0"
                resultNum10.text = "0"
                resultNum5.text = "0"
                resultNum1.text = "0"
            }
        }
    }
}
