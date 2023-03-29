package com.danielfmunoz.ejemplofragments2023

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.danielfmunoz.ejemplofragments2023.databinding.FragmentBatmanBinding
import com.danielfmunoz.ejemplofragments2023.databinding.FragmentSupermanBinding

class SupermanFragment : Fragment() {

    private lateinit var supermanBinding: FragmentSupermanBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        supermanBinding = FragmentSupermanBinding.inflate(inflater, container, false)
        val view =  supermanBinding.root

        supermanBinding.imageView.setOnClickListener {
            findNavController().navigate(SupermanFragmentDirections.actionSupermanFragmentToBatmanFragment())
        }

        return view
    }

}