package com.example.new_odev3.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.new_odev3.R
import com.example.new_odev3.databinding.FragmentSayfaABinding

class sayfa_aFragment : Fragment() {
private  lateinit var  binding: FragmentSayfaABinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSayfaABinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.gecisadanB.setOnClickListener {
            val gecisab= sayfa_aFragmentDirections.actionSayfaAFragmentToSayfaBFragment()
            Navigation.findNavController(it).navigate(gecisab)
        }
    }

}