package org.example

import java.time.LocalDate

data class Seance(val date: LocalDate, val duree: Int, val categorie: CategorieSeance, val ressentie: Ressenti, val exercice: List<Exercice>){
    init {
        require(duree > 0)
        require(exercice.isNotEmpty())
    }
}

enum class CategorieSeance {
    MUSCULATION,
    CARDIO,
    HIIT,
    YOGA,
    ETIREMENTS,
    AUTRE
}

enum class Ressenti {
    TRES_BIEN,
    BIEN,
    MOYEN,
    DIFFICILE,
    TRES_DIFFICILE
}
