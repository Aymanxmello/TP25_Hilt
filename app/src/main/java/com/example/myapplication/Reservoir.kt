package com.example.myapplication

import javax.inject.Inject


class Reservoir  @Inject constructor (private val carburant: CarburantHilt) {
    fun verifierNiveau(): String {
        return "Niveau de carburant: ${carburant.typeDeCarburant()}"
    }
}
