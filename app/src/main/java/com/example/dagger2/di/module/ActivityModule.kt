package com.example.dagger2.di.module

import com.example.dagger2.MainActivity
import com.example.dagger2.MainActivity2
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun contributeMainActivity2(): MainActivity2
}