package com.example.adornado_activity3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.adornado_activity3.databinding.FragmentLandingPageBinding


class LandingPage : Fragment() {

    lateinit var binding: FragmentLandingPageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLandingPageBinding.inflate(inflater)
        return binding.root
    }

    companion object {
        //coming soon
    }
}