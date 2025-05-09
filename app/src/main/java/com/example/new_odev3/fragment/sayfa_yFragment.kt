package com.example.new_odev3.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.example.new_odev3.R
import com.example.new_odev3.databinding.FragmentSayfaABinding
import com.example.new_odev3.databinding.FragmentSayfaYBinding

class sayfa_yFragment : Fragment() {
    private  lateinit var  binding: FragmentSayfaYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSayfaYBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                val action = sayfa_yFragmentDirections.actionSayfaYFragmentToAnasayfaFragment()
                Navigation.findNavController(requireView()).navigate(action)
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(
            viewLifecycleOwner,
            callback
        )
    }
}