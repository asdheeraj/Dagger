package com.dheeraj.dagger.model.processor

import com.dheeraj.dagger.di.qualifiers.ProcessorGeneration
import com.dheeraj.dagger.di.qualifiers.ProcessorName
import javax.inject.Inject

class ArmProcessor @Inject constructor(
    @ProcessorName override val type: String,
    @ProcessorGeneration override val generation: String
) : Processor {

    // internal implementation
    private val microControllers = 50

    override fun process(vararg tasks: Any): Any {
        // do processing and return the result
        return byteArrayOf(microControllers.toByte())
    }
}