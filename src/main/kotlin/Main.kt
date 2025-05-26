package org.example

import javafx.application.Application
import javafx.scene.control.TableView
import javafx.stage.Stage


class SuiviSportifGUI : Application() {
    private val gestionExercice = GestionExercice()
    private val tableView = TableView<Exercice>()

    override fun start(primaryStage: Stage) {
        primaryStage.title = "Suivi sportif"
        primaryStage.minWidth = 800.0
        primaryStage.minHeight = 600.0

    }
}

fun main() {
    Application.launch(SuiviSportifGUI::class.java)
}
