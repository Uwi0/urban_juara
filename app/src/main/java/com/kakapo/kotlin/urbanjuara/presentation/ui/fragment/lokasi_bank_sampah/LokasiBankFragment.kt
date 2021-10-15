package com.kakapo.kotlin.urbanjuara.presentation.ui.fragment.lokasi_bank_sampah

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.kotlin.urbanjuara.R

class LokasiBankFragment : Fragment() {

    companion object {
        fun newInstance() = LokasiBankFragment()
    }

    private lateinit var viewModel: LokasiBankViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.lokasi_bank_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LokasiBankViewModel::class.java)
        // TODO: Use the ViewModel
    }

}