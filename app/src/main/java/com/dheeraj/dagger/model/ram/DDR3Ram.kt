package com.dheeraj.dagger.model.ram

import com.dheeraj.dagger.di.qualifiers.RamManufacturer
import com.dheeraj.dagger.di.qualifiers.RamType
import javax.inject.Inject

class DDR3Ram @Inject constructor(
    @RamManufacturer override val manufacturer: String,
    @RamType override val type: String
) : Ram {

    // internal implementation on how it works
    private val totalMemory = 512 * 1024 * 1024 // Bytes

    override fun store(byteArray: ByteArray) {
        // store the bytes in memory
    }

    override fun clear() {
//        clear the memory
    }
}