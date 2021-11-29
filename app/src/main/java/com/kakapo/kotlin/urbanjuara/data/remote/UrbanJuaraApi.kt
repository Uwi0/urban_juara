package com.kakapo.kotlin.urbanjuara.data.remote

import com.kakapo.kotlin.urbanjuara.data.remote.dto.TrashTypeDto
import retrofit2.http.GET
import retrofit2.http.Path

interface UrbanJuaraApi {

    @GET("trash_category")
    suspend fun getTrashType(): TrashTypeDto

    @GET("trash_type/{id}")
    suspend fun getTrashTypeById(@Path("id") id: String): TrashTypeDto

}