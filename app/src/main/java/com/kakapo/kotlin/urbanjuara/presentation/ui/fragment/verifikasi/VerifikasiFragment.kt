package com.kakapo.kotlin.urbanjuara.presentation.ui.fragment.verifikasi

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.kotlin.urbanjuara.R

class VerifikasiFragment : Fragment() {

    companion object {
        fun newInstance() = VerifikasiFragment()
    }

    private lateinit var viewModel: VerifikasiViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.verifikasi_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(VerifikasiViewModel::class.java)
        // TODO: Use the ViewModel
    }

}