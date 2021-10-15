package com.kakapo.kotlin.urbanjuara.presentation.ui.fragment.new_profile

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.kotlin.urbanjuara.R

class NewProfileFragment : Fragment() {

    companion object {
        fun newInstance() = NewProfileFragment()
    }

    private lateinit var viewModel: NewProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.new_profile_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(NewProfileViewModel::class.java)
        // TODO: Use the ViewModel
    }

}