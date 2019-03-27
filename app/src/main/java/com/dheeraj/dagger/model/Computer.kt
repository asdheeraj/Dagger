package com.dheeraj.dagger.model

import com.dheeraj.dagger.di.qualifiers.ComputerName
import com.dheeraj.dagger.model.display.Display
import javax.inject.Inject

class Computer @Inject constructor(
    @ComputerName val name: String,
    val motherboard: Motherboard,
    val keyboard: Keyboard,
    val display: Display
) {

    fun boot() {
        motherboard.start()
        display.turnOn()
    }

    fun shutdown() {
        motherboard.stop()
        display.turnOff()
    }
}