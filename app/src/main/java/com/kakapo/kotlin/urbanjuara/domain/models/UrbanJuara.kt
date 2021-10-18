package com.kakapo.kotlin.urbanjuara.domain.models

data class UrbanJuara(
    val userName: String,
    val password: String,
    val nomorHp: String? = null,
    val namaDepan: String? = null,
    val namaBelakang: String? = null,
    val email: String? = null,
    val barcode: Int? = null
)