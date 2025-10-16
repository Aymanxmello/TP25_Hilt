package com.example.myapplication
import javax.inject.Inject

class VoitureHilt @Inject constructor(
    private val moteur: MoteurHilt,
    private val reservoir: Reservoir
) {
    fun conduire(): String {
        val moteurMessage = moteur.demarrer()
        val reservoirMessage = reservoir.verifierNiveau()
        return "$moteurMessage\n$reservoirMessage\nLa voiture est en route!"
    }
}