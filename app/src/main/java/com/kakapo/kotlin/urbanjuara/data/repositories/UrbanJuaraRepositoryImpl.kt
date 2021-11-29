package com.kakapo.kotlin.urbanjuara.data.repositories

import com.kakapo.kotlin.urbanjuara.data.remote.UrbanJuaraApi
import com.kakapo.kotlin.urbanjuara.data.remote.dto.TrashTypeDto
import com.kakapo.kotlin.urbanjuara.domain.repositories.UrbanJuaraRepository
import javax.inject.Inject

class UrbanJuaraRepositoryImpl @Inject constructor(
    private val api: UrbanJuaraApi
) : UrbanJuaraRepository {

    override suspend fun getTrashType(): TrashTypeDto {
        return api.getTrashType()
    }

    override suspend fun getTrashTyoeById(id: String): TrashTypeDto {
        return api.getTrashTypeById(id)
    }


}