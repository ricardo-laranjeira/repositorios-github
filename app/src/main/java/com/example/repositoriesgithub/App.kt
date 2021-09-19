package com.example.repositoriesgithub

import android.app.Application
import com.example.repositoriesgithub.data.di.DataModule
import com.example.repositoriesgithub.domain.di.DomainModule
import com.example.repositoriesgithub.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}