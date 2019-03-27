package com.dheeraj.dagger.di.module

import com.dheeraj.dagger.di.qualifiers.*
import com.dheeraj.dagger.model.Computer
import com.dheeraj.dagger.model.display.Display
import com.dheeraj.dagger.model.display.LCD
import com.dheeraj.dagger.model.processor.ArmProcessor
import com.dheeraj.dagger.model.processor.Processor
import com.dheeraj.dagger.model.ram.DDR5Ram
import com.dheeraj.dagger.model.ram.Ram
import dagger.Module
import dagger.Provides

@Module
class SpecializedComputerModule {

    @Provides
    @ComputerName
    fun provideComputerName() = "Dell XPS"

    @Provides
    @ProcessorName
    fun provideProcessorName() = "arm_64"

    @Provides
    @ProcessorGeneration
    fun provideProcessorGeneration() = "2th"

    @Provides
    @RamManufacturer
    fun provideRamManufacturer() = "Corsair"

    @Provides
    @RamType
    fun provideRamType() = "DDR5"

    @Provides
    @KeyboardName
    fun provideKeyboard() = "Dell"

    @Provides
    fun provideDisplay(): Display = LCD(300, 2400, 1600)

    @Provides
    fun provideProcessor(processor: ArmProcessor): Processor = processor

    @Provides
    fun provideRam(ram: DDR5Ram): Ram = ram

    @Provides
    @SpecializedComputer
    fun provideComputer(computer: Computer) = computer
}