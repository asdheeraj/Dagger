package com.dheeraj.dagger.model.ram

interface Ram {

    val manufacturer: String
    val type: String

    fun store(byteArray: ByteArray)

    fun clear()
}