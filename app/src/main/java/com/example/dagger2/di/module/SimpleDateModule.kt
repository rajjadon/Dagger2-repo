package com.example.dagger2.di.module

import dagger.Module
import dagger.Provides
import java.text.SimpleDateFormat

@Module
class SimpleDateModule {
    @Provides
    fun providesSimpleDate() = SimpleDateFormat()
}