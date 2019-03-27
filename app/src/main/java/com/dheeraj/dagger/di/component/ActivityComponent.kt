package com.dheeraj.dagger.di.component

import android.app.Activity
import com.dheeraj.dagger.di.module.ActivityModule
import com.dheeraj.dagger.di.module.SpecializedComputerModule
import com.dheeraj.dagger.di.qualifiers.SpecializedComputer
import com.dheeraj.dagger.di.scope.ActivityScope
import com.dheeraj.dagger.model.Computer
import com.dheeraj.dagger.ui.MainActivity
import dagger.Component


@ActivityScope
@Component(
    dependencies = [ApplicationComponent::class],
    modules = [
        ActivityModule::class,
        SpecializedComputerModule::class
    ]
)
interface ActivityComponent {

    fun inject(activity: MainActivity)

    @SpecializedComputer
    fun getComputer(): Computer

    fun getActivity(): Activity
}