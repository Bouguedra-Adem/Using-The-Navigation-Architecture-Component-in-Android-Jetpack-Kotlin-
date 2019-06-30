package com.example.tp

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class  ViewModel(application: Application) : AndroidViewModel(application) {

    val ville =getData()


    fun getData():List<Ville>
    {
        var ville= mutableListOf<Ville>()
         ville.add(Ville("Annaba", 2588999, "annabaimg", "c'est une ville touristique"))
        ville.add(Ville("Oran", 2884848, "oranimg", "Oran c'est une ville touristique"))
        return ville
    }
}