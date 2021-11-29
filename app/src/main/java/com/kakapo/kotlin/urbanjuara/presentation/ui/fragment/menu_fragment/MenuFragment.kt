package com.kakapo.kotlin.urbanjuara.presentation.ui.fragment.menu_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.kakapo.kotlin.urbanjuara.R
import com.kakapo.kotlin.urbanjuara.databinding.MenuFragmentBinding
import com.kakapo.kotlin.urbanjuara.presentation.ui.main.MainActivity

class MenuFragment : Fragment() {

    companion object {
        fun newInstance() = MenuFragment()
    }

    private lateinit var binding: MenuFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MenuFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonPengaturanOnClick()
        buttonKeluarOnClick()
    }

    private fun buttonPengaturanOnClick() {
        binding.btnPengaturan.setOnClickListener {
            goToFragmentPengaturan(it)
        }
    }

    private fun goToFragmentPengaturan(view: View) {
        Navigation.findNavController(view).navigate(R.id.action_to_pengaturanFragment)
    }

    private fun buttonKeluarOnClick(){
        binding.btnKeluar.setOnClickListener {
            (activity as MainActivity).closeApp()
        }
    }

}