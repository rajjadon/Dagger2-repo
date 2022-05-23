package com.example.dagger2

import android.app.Application
import com.example.dagger2.di.DaggerDiComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class AppClass : Application(), HasAndroidInjector {

    override fun onCreate() {
        super.onCreate()
        DaggerDiComponent.builder().application(this).build().inject(this)
    }

    @Inject
    lateinit var obj: DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> {
        return obj
    }
}