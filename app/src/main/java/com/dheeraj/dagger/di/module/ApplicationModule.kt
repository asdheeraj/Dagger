package com.dheeraj.dagger.di.module

import android.content.Context
import com.dheeraj.dagger.MyApplication
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(var application: MyApplication) {

    @Provides
    fun provideContext(): Context = application
}