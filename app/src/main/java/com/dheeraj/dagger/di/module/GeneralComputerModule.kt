package com.dheeraj.dagger.di.module

import com.dheeraj.dagger.di.qualifiers.*
import com.dheeraj.dagger.model.Computer
import com.dheeraj.dagger.model.display.Display
import com.dheeraj.dagger.model.display.LCD
import com.dheeraj.dagger.model.processor.Processor
import com.dheeraj.dagger.model.ram.DDR3Ram
import com.dheeraj.dagger.model.ram.Ram
import com.dheeraj.dagger.model.processor.IntelProcessor
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class GeneralComputerModule {

    @Provides
    @ComputerName
    fun provideComputerName() = "Dell Inspiron"

    @Provides
    @ProcessorName
    fun provideProcessorName() = "x86_64"

    @Provides
    @ProcessorGeneration
    fun provideProcessorGeneration() = "9th"

    @Provides
    @RamManufacturer
    fun provideRamManufacturer() = "Samsung"

    @Provides
    @RamType
    fun provideRamType() = "DDR3"

    @Provides
    @KeyboardName
    fun provideKeyboard() = "Apple"

    @Provides
    fun provideDisplay(): Display = LCD(200, 1920, 1080)

    @Provides
    fun provideProcessor(processor: IntelProcessor): Processor = processor

    @Provides
    fun provideRam(ram: DDR3Ram): Ram = ram

    @Singleton
    @Provides
    @GeneralComputer
    fun provideComputer(computer: Computer) = computer
}