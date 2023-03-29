package com.danielfmunoz.ejemplofragments2023

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.danielfmunoz.ejemplofragments2023.databinding.FragmentBatmanBinding

class BatmanFragment : Fragment() {

    private lateinit var batmanBinding: FragmentBatmanBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        batmanBinding = FragmentBatmanBinding.inflate(inflater, container, false)
        val view =  batmanBinding.root

        batmanBinding.imageView.setOnClickListener {
            findNavController().navigate(BatmanFragmentDirections.actionBatmanFragmentToFlashFragment())
        }

        return view
    }
}