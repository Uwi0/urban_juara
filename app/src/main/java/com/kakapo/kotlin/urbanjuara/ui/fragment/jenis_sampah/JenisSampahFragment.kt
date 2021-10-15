package com.kakapo.kotlin.urbanjuara.ui.fragment.jenis_sampah

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.kotlin.urbanjuara.R

class JenisSampahFragment : Fragment() {

    companion object {
        fun newInstance() = JenisSampahFragment()
    }

    private lateinit var viewModel: JenisSampahViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.jenis_sampah_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(JenisSampahViewModel::class.java)
        // TODO: Use the ViewModel
    }

}