package com.danielfmunoz.ejemplofragments2023

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.danielfmunoz.ejemplofragments2023.databinding.FragmentFlashBinding

class FlashFragment : Fragment() {

    private lateinit var flashBinding: FragmentFlashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        flashBinding = FragmentFlashBinding.inflate(inflater, container, false)
        val view =  flashBinding.root

        flashBinding.imageView.setOnClickListener {
            findNavController().navigate(FlashFragmentDirections.actionFlashFragmentToWonderWomanFragment3())
        }

        return view
    }
}