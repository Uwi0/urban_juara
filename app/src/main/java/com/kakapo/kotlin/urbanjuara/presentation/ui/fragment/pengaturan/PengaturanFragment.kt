package com.kakapo.kotlin.urbanjuara.presentation.ui.fragment.pengaturan

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.kotlin.urbanjuara.R

class PengaturanFragment : Fragment() {

    companion object {
        fun newInstance() = PengaturanFragment()
    }

    private lateinit var viewModel: PengaturanViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.pengaturan_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PengaturanViewModel::class.java)
        // TODO: Use the ViewModel
    }

}