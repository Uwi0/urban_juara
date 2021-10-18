package com.kakapo.kotlin.urbanjuara.data.remote.dto

import com.kakapo.kotlin.urbanjuara.domain.models.UrbanJuara

data class UrbanJuaraDto(
    val userName: String,
    val password: String,
    val nomorHp: String? = null,
    val namaDepan: String? = null,
    val namaBelakang: String? = null,
    val email: String? = null,
    val barcode: Int? = null
)

fun UrbanJuaraDto.toUrbanJuara(): UrbanJuara{
    return UrbanJuara(
        userName = userName,
        password = password,
        nomorHp = nomorHp,
        namaDepan = namaDepan,
        namaBelakang = namaBelakang,
        email = email,
        barcode = barcode
    )
}
