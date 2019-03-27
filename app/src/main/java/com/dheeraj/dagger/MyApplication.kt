package com.dheeraj.dagger

import android.app.Application
import android.util.Log
import com.dheeraj.dagger.di.module.ApplicationModule
import com.dheeraj.dagger.di.qualifiers.GeneralComputer
import com.dheeraj.dagger.model.Computer
import com.dheeraj.dagger.di.component.ApplicationComponent
import com.dheeraj.dagger.di.component.DaggerApplicationComponent
import javax.inject.Inject


class MyApplication: Application() {

    lateinit var applicationComponent: ApplicationComponent

    @Inject
    @field:GeneralComputer
    lateinit var generalComputer: Computer

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)

        Log.d("MyApplication", "${generalComputer.hashCode()}: ${generalComputer.name}")
    }
}