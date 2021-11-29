package com.kakapo.kotlin.urbanjuara.presentation.ui.fragment.jenis_sampah

import androidx.lifecycle.*
import com.kakapo.kotlin.urbanjuara.common.Resource
import com.kakapo.kotlin.urbanjuara.domain.use_case.get_trash_types.GetTrashTypes
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class JenisSampahViewModel @Inject constructor(
    private val getTrashTypeUseCase: GetTrashTypes,
) : ViewModel() {

    private val _state = MutableLiveData<TrashTypeListState>()
    val state: LiveData<TrashTypeListState> = _state

    init {
        getTrashTypes()
    }

    private fun getTrashTypes() {
        getTrashTypeUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = TrashTypeListState(trashTypes = result.data ?: emptyList())
                }
                is Resource.Error -> {
                    _state.value = TrashTypeListState(error = result.message ?: "An unexpected error")
                }
                is Resource.Loading ->{
                    _state.value = TrashTypeListState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }
}