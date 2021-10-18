package com.kakapo.kotlin.urbanjuara.presentation.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kakapo.kotlin.urbanjuara.databinding.ItemPointBinding
import com.kakapo.kotlin.urbanjuara.domain.models.Point

class RiwayatTransaksiAdapter(
    private val fragment: Fragment,
    private val listPoint: List<Point>
) : RecyclerView.Adapter<RiwayatTransaksiAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemPointBinding =
            ItemPointBinding.inflate(LayoutInflater.from(fragment.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val point = listPoint[position]
        holder.point.text = point.pointKeterangan
        holder.pointJumlah.text = point.pointJumlah
        holder.pointTanggal.text = point.pointTanggal
        Glide.with(fragment).load(point.icon).into(holder.imgPoint)
    }

    override fun getItemCount(): Int {
        return listPoint.size
    }

    class ViewHolder(val binding: ItemPointBinding) : RecyclerView.ViewHolder(binding.root) {
        val point = binding.txtPoint
        val pointTanggal = binding.txtTanggal
        val pointJumlah = binding.txtJumlahPoint
        val imgPoint = binding.pointIcon
    }
}