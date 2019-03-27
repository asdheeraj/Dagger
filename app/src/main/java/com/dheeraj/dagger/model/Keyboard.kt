package com.dheeraj.dagger.model

import com.dheeraj.dagger.di.qualifiers.KeyboardName
import javax.inject.Inject

class Keyboard @Inject constructor(@KeyboardName val name: String) {
    // have implementation of reading inputs
}
