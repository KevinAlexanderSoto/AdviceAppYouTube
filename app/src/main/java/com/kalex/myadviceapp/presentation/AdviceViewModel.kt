package com.kalex.myadviceapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kalex.myadviceapp.domain.GetAdviceUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update

/**
 * @author kevin-soto Alexander Soto on 24/02/24
 * **/
class AdviceViewModel (
    private val getAdviceUseCase: GetAdviceUseCase
): ViewModel() {

    private val _advice: MutableStateFlow<String> = MutableStateFlow("")
    var advice : StateFlow<String> = _advice.asStateFlow()


    fun getNewAdvice(){
        getAdviceUseCase().onEach { result ->
            _advice.update {
                result
            }
        }.launchIn(viewModelScope)
    }

}