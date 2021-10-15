package com.kakapo.kotlin.urbanjuara.ui.fragment.tukar_point_ojek

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.kotlin.urbanjuara.R

class TukarPoinOjekFragment : Fragment() {

    companion object {
        fun newInstance() = TukarPoinOjekFragment()
    }

    private lateinit var viewModel: TukarPoinOjekViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tukar_poin_ojek_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TukarPoinOjekViewModel::class.java)
        // TODO: Use the ViewModel
    }

}