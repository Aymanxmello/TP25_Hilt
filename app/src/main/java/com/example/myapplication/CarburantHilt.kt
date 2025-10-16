package com.example.myapplication
import javax.inject.Inject

class CarburantHilt @Inject constructor() {
    fun typeDeCarburant(): String {
        return "Essence"
    }
}