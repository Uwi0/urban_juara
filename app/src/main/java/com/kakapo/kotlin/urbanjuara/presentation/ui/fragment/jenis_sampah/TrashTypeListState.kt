package com.kakapo.kotlin.urbanjuara.presentation.ui.fragment.jenis_sampah

import com.kakapo.kotlin.urbanjuara.domain.models.TrashType

data class TrashTypeListState(
    val isLoading: Boolean = false,
    val trashTypes: List<TrashType> = emptyList(),
    val error: String = ""
)
