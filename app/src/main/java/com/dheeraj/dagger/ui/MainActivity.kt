package com.dheeraj.dagger.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.dheeraj.dagger.MyApplication
import com.dheeraj.dagger.R
import com.dheeraj.dagger.di.component.DaggerActivityComponent
import com.dheeraj.dagger.di.module.ActivityModule
import com.dheeraj.dagger.di.qualifiers.GeneralComputer
import com.dheeraj.dagger.di.qualifiers.SpecializedComputer
import com.dheeraj.dagger.model.Computer
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    @field:GeneralComputer
    lateinit var generalComputer: Computer

    @Inject
    @field:SpecializedComputer
    lateinit var specialisedComputer: Computer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerActivityComponent.builder()
            .activityModule(ActivityModule(this))
            .applicationComponent((application as MyApplication).applicationComponent)
            .build()
            .inject(this)

        Log.d("MainActivity", "${generalComputer.hashCode()}: ${generalComputer.name}")
        Log.d("MainActivity", "${specialisedComputer.hashCode()}: ${specialisedComputer.name}")

        @SuppressLint("SetTextI18n")
        tv_display.text = "${generalComputer.name}, ${specialisedComputer.name}"
    }
}
