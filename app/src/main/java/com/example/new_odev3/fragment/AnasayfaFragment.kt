package com.example.new_odev3.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.new_odev3.R
import com.example.new_odev3.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var  binding: FragmentAnasayfaBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentAnasayfaBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.gecisanadaA.setOnClickListener {
            val action = AnasayfaFragmentDirections.actionAnasayfaFragmentToSayfaAFragment()
            Navigation.findNavController(it).navigate(action)
        }
        binding.gecisanadanX.setOnClickListener {
            val xgecis = AnasayfaFragmentDirections.actionAnasayfaFragmentToSayfaXFragment()
            Navigation.findNavController(it).navigate(xgecis)
        }
    }
}