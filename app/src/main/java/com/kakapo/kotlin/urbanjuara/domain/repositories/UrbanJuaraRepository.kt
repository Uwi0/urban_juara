package com.kakapo.kotlin.urbanjuara.domain.repositories

import com.kakapo.kotlin.urbanjuara.domain.models.UrbanJuara

interface UrbanJuaraRepository {

    suspend fun getUserData(): UrbanJuara

}