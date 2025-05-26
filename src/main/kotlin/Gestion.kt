package org.example

class GestionExercice {
    private val seance = mutableListOf<Exercice>()

    fun ajouterSeance(ex: Exercice) {
        seance.add(ex)
    }

    fun supprimerExercice(id : Int) {
        seance.removeAt(id)
    }
}