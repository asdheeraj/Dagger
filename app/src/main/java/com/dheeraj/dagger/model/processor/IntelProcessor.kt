package com.dheeraj.dagger.model.processor

import com.dheeraj.dagger.di.qualifiers.ProcessorGeneration
import com.dheeraj.dagger.di.qualifiers.ProcessorName
import com.dheeraj.dagger.model.processor.Processor
import javax.inject.Inject

class IntelProcessor @Inject constructor(
    @ProcessorName override val type: String,
    @ProcessorGeneration override val generation: String

) : Processor {

    // internal implementation
    private val gpioPins = 40

    override fun process(vararg tasks: Any): Any {
        // do processing and return the result
        return byteArrayOf(gpioPins.toByte())
    }
}