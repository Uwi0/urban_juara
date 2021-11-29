package com.kakapo.kotlin.urbanjuara.data.remote.dto

data class DataX(
    val created_at: Any,
    val id: Int,
    val id_kategori_sampah: String,
    val jenis_sampah: String,
    val point: String,
    val trash_category: TrashCategory,
    val updated_at: Any
)