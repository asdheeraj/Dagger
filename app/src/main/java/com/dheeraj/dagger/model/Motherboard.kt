package com.dheeraj.dagger.model

import com.dheeraj.dagger.model.processor.Processor
import com.dheeraj.dagger.model.ram.Ram
import javax.inject.Inject

class Motherboard @Inject constructor(val processor: Processor, val ram: Ram) {

    fun start() {
        // do something
    }

    fun stop() {
        // do something
    }
}