package com.kalex.myadviceapp.model

import com.kalex.myadviceapp.model.dto.Splip

/**
 * @author kevin-soto Alexander Soto on 24/02/24
 * **/
class AdviceRepository(
    private val api: AdviceAPI
) {

    suspend fun getAdvice(): Splip {
        return api.getAdvice()
    }

}