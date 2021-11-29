package com.kakapo.kotlin.urbanjuara.presentation.ui.fragment.jenis_sampah_detail

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.kotlin.urbanjuara.R

class JenisSampahDetailFragment : Fragment() {

    companion object {
        fun newInstance() = JenisSampahDetailFragment()
    }

    private lateinit var viewModel: JenisSampahDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.jenis_sampah_detail_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(JenisSampahDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}