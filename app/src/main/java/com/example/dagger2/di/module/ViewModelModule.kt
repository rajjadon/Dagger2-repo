package com.example.dagger2.di.module

import androidx.lifecycle.ViewModel
import com.example.dagger2.MainActivity2ViewModel
import com.example.dagger2.di.MainActivity1ViewModel
import com.example.dagger2.di.qulifires.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainActivity1ViewModel::class)
    protected abstract fun providesMainActivity1ViewModel(viewModel: MainActivity1ViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MainActivity2ViewModel::class)
    protected abstract fun providesMainActivity2ViewModel(viewModel: MainActivity2ViewModel): ViewModel
}