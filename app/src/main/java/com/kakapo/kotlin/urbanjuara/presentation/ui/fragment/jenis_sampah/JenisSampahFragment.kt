package com.kakapo.kotlin.urbanjuara.presentation.ui.fragment.jenis_sampah

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.kakapo.kotlin.urbanjuara.R
import com.kakapo.kotlin.urbanjuara.databinding.JenisSampahFragmentBinding

class JenisSampahFragment : Fragment() {

    private val viewModel by viewModels<JenisSampahViewModel>()
    private lateinit var binding: JenisSampahFragmentBinding
    private var state: TrashTypeListState? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = JenisSampahFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val state = viewModel.state.value
        Log.i("result", state.toString())
        buttonSampahPlastikOnClick()
        buttonSampahKertasOnClick()
        buttonSampahPecahbelahOnClick()
        buttonSampahOrganikOnClick()
        buttonSampahKardusOnClick()
        buttonSampahKalengOnClick()
        buttonSampahB3OnClick()
    }

    private fun buttonSampahPlastikOnClick() {
        binding.btnSampahPlastik.setOnClickListener {
            goToFragmentSampahPlastikDetail(it)
        }
    }

    private fun goToFragmentSampahPlastikDetail(view: View) {
        Navigation.findNavController(view)
            .navigate(R.id.action_jenisSampahFragment_to_jenisSampahDetailFragment)
    }

    private fun buttonSampahKertasOnClick(){
        binding.btnSampahKertas.setOnClickListener {
            goToFragmentSampahPlastikDetail(it)
        }
    }

    private fun buttonSampahPecahbelahOnClick(){
        binding.btnSampahPecahBelah.setOnClickListener {
            goToFragmentSampahPlastikDetail(it)
        }
    }

    private fun buttonSampahOrganikOnClick(){
        binding.btnSampahOrganik.setOnClickListener {
            goToFragmentSampahPlastikDetail(it)
        }
    }

    private fun buttonSampahKardusOnClick(){
        binding.btnSampahKardus.setOnClickListener {
            goToFragmentSampahPlastikDetail(it)
        }
    }

    private fun buttonSampahKalengOnClick(){
        binding.btnSampahKaleng.setOnClickListener {
            goToFragmentSampahPlastikDetail(it)
        }
    }

    private fun buttonSampahB3OnClick(){
        binding.btnSampahB3.setOnClickListener {
            goToFragmentSampahPlastikDetail(it)
        }
    }

}