package com.kalex.myadviceapp

import android.app.Application
import com.kalex.myadviceapp.di.adviceModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

/**
 * @author kevin-soto Alexander Soto on 24/02/24
 * **/
class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidLogger()
            androidContext(this@MainApplication)
            modules(adviceModule)
        }
    }
}