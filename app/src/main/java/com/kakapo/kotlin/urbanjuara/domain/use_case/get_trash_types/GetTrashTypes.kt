package com.kakapo.kotlin.urbanjuara.domain.use_case.get_trash_types

import com.bumptech.glide.load.HttpException
import com.kakapo.kotlin.urbanjuara.common.Resource
import com.kakapo.kotlin.urbanjuara.data.remote.dto.toTrashType
import com.kakapo.kotlin.urbanjuara.domain.models.TrashType
import com.kakapo.kotlin.urbanjuara.domain.repositories.UrbanJuaraRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import javax.inject.Inject

class GetTrashTypes @Inject constructor(
    private val repository: UrbanJuaraRepository
) {
    operator fun invoke(): Flow<Resource<List<TrashType>>> = flow {
        try {
            emit(Resource.Loading<List<TrashType>>())
            val trashTypes = repository.getTrashType().map { it.toTrashType() }
            emit(Resource.Success<List<TrashType>>(trashTypes))
        }catch (e: HttpException){
            emit(Resource.Error<List<TrashType>>(e.localizedMessage ?: "An unexpected error occurred"))
        }catch (e: IOException){
            emit(Resource.Error<List<TrashType>>("Couldn't reach server. check your internet connection"))
        }
    }
}