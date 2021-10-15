package com.kakapo.kotlin.urbanjuara.presentation.ui.fragment.tukar_poin_lanjutan

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.kotlin.urbanjuara.R

class TukarPointLanjutanFragment : Fragment() {

    companion object {
        fun newInstance() = TukarPointLanjutanFragment()
    }

    private lateinit var viewModel: TukarPointLanjutanViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tukar_point_lanjutan_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TukarPointLanjutanViewModel::class.java)
        // TODO: Use the ViewModel
    }

}