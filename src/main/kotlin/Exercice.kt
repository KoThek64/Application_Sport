package org.example

data class Exercice(val id: Int, val nom: String, val repetition: Int, val poids: Double, val muscle: List<Muscle>){
    init {
        require(muscle.isNotEmpty())
    }
}

enum class Muscle {
    TRICEPS,
    PECTORAUX,
    ABDOMINAUX,
    BICEPS,
    EPAULES,
    AVANT_BRAS,
    COU,
    QUADRICEPS,
    MOLLETS,
    FESSES,
    LOMBAIRES,
    DOS
}
