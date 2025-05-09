package com.example.new_odev3.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.new_odev3.R
import com.example.new_odev3.databinding.FragmentSayfaABinding
import com.example.new_odev3.databinding.FragmentSayfaBBinding

class sayfa_bFragment : Fragment() {
    private  lateinit var  binding: FragmentSayfaBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        }

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            binding= FragmentSayfaBBinding.inflate(inflater,container,false)
            return binding.root
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.gecisbdenY.setOnClickListener {
            val gecisby= sayfa_bFragmentDirections.actionSayfaBFragmentToSayfaYFragment()
            Navigation.findNavController(it).navigate(gecisby)
        }
    }

    }