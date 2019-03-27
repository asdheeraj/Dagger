package com.dheeraj.dagger.di.qualifiers

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ProcessorName

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ProcessorGeneration