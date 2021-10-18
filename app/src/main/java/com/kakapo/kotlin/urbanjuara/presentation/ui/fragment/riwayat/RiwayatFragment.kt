package com.kakapo.kotlin.urbanjuara.presentation.ui.fragment.riwayat

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.kakapo.kotlin.urbanjuara.R
import com.kakapo.kotlin.urbanjuara.databinding.RiwayatFragmentBinding
import com.kakapo.kotlin.urbanjuara.domain.models.Point
import com.kakapo.kotlin.urbanjuara.presentation.ui.adapter.RiwayatTransaksiAdapter

class RiwayatFragment : Fragment() {

    companion object {
        fun newInstance() = RiwayatFragment()
    }

    private lateinit var viewModel: RiwayatViewModel
    private lateinit var binding: RiwayatFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = RiwayatFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RiwayatViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        createRecyclerViewPoint()
    }

    private fun createRecyclerViewPoint() {
        val linearLayoutManager = LinearLayoutManager(requireActivity())
        val listPoint = fakePointData()
        val adapter = RiwayatTransaksiAdapter(this, listPoint)
        binding.rcListPoint.layoutManager = linearLayoutManager
        binding.rcListPoint.adapter = adapter
    }

    private fun fakePointData(): List<Point> {
        val point = mutableListOf<Point>()
        val pointMasuk1 = Point(
            pointKeterangan = "masuk",
            pointJumlah = "+10",
            pointTanggal = "12/10/2020",
            icon = R.drawable.ic_point_masuk
        )
        point.add(pointMasuk1)
        val pointMasuk2 = Point(
            pointKeterangan = "masuk",
            pointJumlah = "+10",
            pointTanggal = "12/10/2020",
            icon = R.drawable.ic_point_masuk
        )
        point.add(pointMasuk2)
        val pointKeluar1 = Point(
            pointKeterangan = "keluar",
            pointJumlah = "-10",
            pointTanggal = "12/10/2020",
            icon = R.drawable.ic_point_keluar
        )
        point.add(pointKeluar1)
        val pointMasuk3 = Point(
            pointKeterangan = "masuk",
            pointJumlah = "+10",
            pointTanggal = "12/10/2020",
            icon = R.drawable.ic_point_masuk
        )
        point.add(pointMasuk3)
        val pointKeluar2 = Point(
            pointKeterangan = "keluar",
            pointJumlah = "-10",
            pointTanggal = "12/10/2020",
            icon = R.drawable.ic_point_keluar
        )
        point.add(pointKeluar2)
        return point
    }

}