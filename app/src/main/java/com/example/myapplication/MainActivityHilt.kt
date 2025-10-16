package com.example.myapplication


import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivityHilt : AppCompatActivity() {

    private val TAG = "MainActivityHilt"

    // Injection automatique de la dépendance Voiture
    @Inject
    lateinit var voiture: VoitureHilt

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Pas besoin d'instancier manuellement les objets
        // Hilt injecte automatiquement voiture avec toutes ses dépendances

        // Appel de la méthode conduire() et affichage dans la console
        val message = voiture.conduire()
        Log.d(TAG, message)

        // Affichage dans la console système
        println(message)
    }
}