package com.example.dagger2.di

import android.app.Application
import com.example.dagger2.AppClass
import com.example.dagger2.di.module.ActivityModule
import com.example.dagger2.di.module.SimpleDateModule
import com.example.dagger2.di.module.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, SimpleDateModule::class, ActivityModule::class, ViewModelModule::class])
interface DiComponent {
    fun inject(appClass: AppClass)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): DiComponent
    }
}