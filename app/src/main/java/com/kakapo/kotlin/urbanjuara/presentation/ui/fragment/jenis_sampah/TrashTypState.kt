package com.kakapo.kotlin.urbanjuara.presentation.ui.fragment.jenis_sampah

import com.kakapo.kotlin.urbanjuara.domain.models.TrashType

data class TrashTypState(
    val isLoading: Boolean = false,
    val trashTypes: TrashType? = null,
    val error: String = ""
)
