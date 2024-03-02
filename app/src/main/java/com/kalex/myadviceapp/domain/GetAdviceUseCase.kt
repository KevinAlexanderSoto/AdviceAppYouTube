package com.kalex.myadviceapp.domain

import com.kalex.myadviceapp.model.AdviceRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

/**
 * @author kevin-soto Alexander Soto on 24/02/24
 * **/
class GetAdviceUseCase(
    private val adviceRepository: AdviceRepository
) {
    operator fun invoke(): Flow<String> = flow {
        try {
            emit(adviceRepository.getAdvice().slip.advice)

        } catch (e: Exception) {
//TODO: HANDLE ERROR
        }

    }
}