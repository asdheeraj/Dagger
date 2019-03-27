package com.dheeraj.dagger.di.component

import android.content.Context
import com.dheeraj.dagger.MyApplication
import com.dheeraj.dagger.di.module.ApplicationModule
import com.dheeraj.dagger.di.module.GeneralComputerModule
import com.dheeraj.dagger.di.qualifiers.GeneralComputer
import com.dheeraj.dagger.model.Computer
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ApplicationModule::class,
        GeneralComputerModule::class
    ]
)
interface ApplicationComponent {

    fun inject(application: MyApplication)

    // this should be written with qualifier for it to be available in sub graph
    @GeneralComputer
    fun getComputer(): Computer

    fun getContext(): Context
}