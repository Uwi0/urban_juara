package com.kakapo.kotlin.urbanjuara.domain.use_case.get_trash_type

import com.kakapo.kotlin.urbanjuara.domain.repositories.UrbanJuaraRepository
import javax.inject.Inject

class GetTrashType @Inject constructor(
    private val repository: UrbanJuaraRepository
) {

}