package com.kakapo.kotlin.urbanjuara.presentation.ui.fragment.home

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.kakapo.kotlin.urbanjuara.R
import com.kakapo.kotlin.urbanjuara.databinding.HomeFragmentBinding

class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var viewModel: HomeViewModel
    private lateinit var binding: HomeFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = HomeFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonTukarPointOnClick()
        buttonLokasiSampahOnClick()
        buttonKenaliSampahOnClick()
    }

    private fun buttonTukarPointOnClick(){
        binding.btnImgTukarPoint.setOnClickListener {
            goToFragmentTukarPoint(it)
        }
    }

    private fun goToFragmentTukarPoint(view: View){
        //TODO masih nanti
    }

    private fun buttonLokasiSampahOnClick(){
        binding.btnImgLokasiBank.setOnClickListener {
            goToFragmentLokasiBankSampah(it)
        }
    }

    private fun goToFragmentLokasiBankSampah(view: View){
        Navigation.findNavController(view).navigate(R.id.action_menu_home_to_lokasiBankFragment)
    }

    private fun buttonKenaliSampahOnClick(){
        binding.btnImgKenaliSampah.setOnClickListener {
            goToFragmentKenaliSampah(it)
        }
    }

    private fun goToFragmentKenaliSampah(view: View){
        Navigation.findNavController(view).navigate(R.id.action_menu_home_to_jenisSampahFragment)
    }



}