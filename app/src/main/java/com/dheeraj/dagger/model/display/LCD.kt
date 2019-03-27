package com.dheeraj.dagger.model.display

import android.graphics.Picture

class LCD constructor(
    override val pixelDensity: Int,
    override val widthPixels: Int,
    override val heightPixels: Int
) : Display {

    override fun turnOn(): Picture {
        //Do Something
        return Picture()
    }

    override fun turnOff() {
        //Do something
    }

}