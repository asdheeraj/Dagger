package com.dheeraj.dagger.model.processor

interface Processor {

    val type: String
    val generation: String

    fun process(vararg tasks: Any) : Any

}