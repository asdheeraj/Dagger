package com.dheeraj.dagger.di.module

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(var activity: AppCompatActivity) {
    @Provides
    fun provideActivity(): Activity = activity
}