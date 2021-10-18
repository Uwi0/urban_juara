package com.kakapo.kotlin.urbanjuara.presentation.ui.fragment.daftar

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.kakapo.kotlin.urbanjuara.R
import com.kakapo.kotlin.urbanjuara.databinding.DaftarFragmentBinding

class DaftarFragment : Fragment() {

    companion object {
        fun newInstance() = DaftarFragment()
    }

    private lateinit var viewModel: DaftarViewModel
    private lateinit var binding: DaftarFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DaftarFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DaftarViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonDaftarOnClick()
    }

    private fun buttonDaftarOnClick(){
        binding.btnDaftar.setOnClickListener {
            goToFragmentVerifikasi(it)
        }
    }

    private fun goToFragmentVerifikasi(view: View){
        Navigation.findNavController(view).navigate(R.id.action_daftarFragment)
    }

}