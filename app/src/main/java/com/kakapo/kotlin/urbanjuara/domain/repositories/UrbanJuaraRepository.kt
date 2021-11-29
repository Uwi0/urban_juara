package com.kakapo.kotlin.urbanjuara.domain.repositories

import com.kakapo.kotlin.urbanjuara.data.remote.dto.TrashTypeDto

interface UrbanJuaraRepository {

    suspend fun getTrashType(): TrashTypeDto

    suspend fun getTrashTyoeById(id: String): TrashTypeDto
}