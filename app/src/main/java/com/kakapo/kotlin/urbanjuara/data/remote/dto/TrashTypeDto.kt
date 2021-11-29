package com.kakapo.kotlin.urbanjuara.data.remote.dto

import com.kakapo.kotlin.urbanjuara.domain.models.TrashType

data class TrashTypeDto(
    val created_at: Any,
    val id: Int,
    val kategori_sampah: String,
    val updated_at: Any
)

fun TrashTypeDto.toTrashType(): TrashType {
    return TrashType(
        kategoriSampah = kategori_sampah
    )
}
