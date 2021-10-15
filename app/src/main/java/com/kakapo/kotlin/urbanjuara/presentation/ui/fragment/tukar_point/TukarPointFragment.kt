package com.kakapo.kotlin.urbanjuara.presentation.ui.fragment.tukar_point

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.kotlin.urbanjuara.R

class TukarPointFragment : Fragment() {

    companion object {
        fun newInstance() = TukarPointFragment()
    }

    private lateinit var viewModel: TukarPointViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tukar_point_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TukarPointViewModel::class.java)
        // TODO: Use the ViewModel
    }

}