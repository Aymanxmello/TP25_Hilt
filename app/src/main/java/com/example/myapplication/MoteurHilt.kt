package com.example.myapplication
import javax.inject.Inject

class MoteurHilt @Inject constructor() {
    fun demarrer(): String {
        return "Le moteur démarre"
    }
}