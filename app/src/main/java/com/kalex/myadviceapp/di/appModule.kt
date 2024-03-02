package com.kalex.myadviceapp.di

import com.kalex.myadviceapp.domain.GetAdviceUseCase
import com.kalex.myadviceapp.model.AdviceAPI
import com.kalex.myadviceapp.model.AdviceRepository
import com.kalex.myadviceapp.presentation.AdviceViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * @author kevin-soto Alexander Soto on 24/02/24
 * **/
val adviceModule = module {
    single<AdviceRepository> { AdviceRepository(get()) }
    factory<GetAdviceUseCase> { GetAdviceUseCase(get()) }
    single<AdviceAPI> {
         Retrofit.Builder()
            .baseUrl("https://api.adviceslip.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(AdviceAPI::class.java)
    }
    viewModel { AdviceViewModel(get()) }
}