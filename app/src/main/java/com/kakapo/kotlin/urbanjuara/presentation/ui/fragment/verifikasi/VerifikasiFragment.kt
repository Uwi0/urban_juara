package com.kakapo.kotlin.urbanjuara.presentation.ui.fragment.verifikasi

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.kakapo.kotlin.urbanjuara.R
import com.kakapo.kotlin.urbanjuara.databinding.VerifikasiFragmentBinding

class VerifikasiFragment : Fragment() {

    companion object {
        fun newInstance() = VerifikasiFragment()
    }

    private lateinit var viewModel: VerifikasiViewModel
    private lateinit var binding: VerifikasiFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = VerifikasiFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(VerifikasiViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonLanjutkanOnClick()
        btnBackOnClick()
    }

    private fun buttonLanjutkanOnClick() {
        binding.btnLanjutkan.setOnClickListener {
            goToFragmentNewProfile(it)
        }
    }

    private fun goToFragmentNewProfile(view: View) {
        Navigation.findNavController(view)
            .navigate(R.id.action_verifikasiFragment_to_newProfileFragment)
    }

    private fun btnBackOnClick(){
        binding.btnBack.setOnClickListener {
            backToDaftarFragment(it)
        }
    }

    private fun backToDaftarFragment(view: View){
        requireActivity().onBackPressed()
    }

}