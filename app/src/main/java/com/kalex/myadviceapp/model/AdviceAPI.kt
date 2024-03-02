package com.kalex.myadviceapp.model

import com.kalex.myadviceapp.model.dto.Splip
import retrofit2.http.GET

/**
 * @author kevin-soto Alexander Soto on 24/02/24
 * **/
interface AdviceAPI {

    @GET("advice")
    suspend fun getAdvice(): Splip

}