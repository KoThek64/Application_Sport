package org.example

import javafx.application.Application
import javafx.beans.property.SimpleDoubleProperty
import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.stage.Stage


class SuiviSportifGUI : Application() {
    private val gestionExercice = GestionExercice()
    private val tableView = TableView<Exercice>()

    override fun start(primaryStage: Stage) {
        primaryStage.title = "Suivi sportif"
        primaryStage.minWidth = 800.0
        primaryStage.minHeight = 600.0

        val nomCol = TableColumn<Exercice, String>("Nom")
        nomCol.setCellValueFactory { SimpleStringProperty(it.value.nom) }

        val repCol = TableColumn<Exercice, Number>("Répétitions")
        repCol.setCellValueFactory { SimpleIntegerProperty(it.value.repetition) }

        val poidsCol = TableColumn<Exercice, Number>("Poids")
        poidsCol.setCellValueFactory { SimpleDoubleProperty(it.value.poids) }

        val muscleCol = TableColumn<Exercice, String>("Muscles")
        muscleCol.setCellValueFactory { SimpleStringProperty(it.value.muscle.joinToString()) }

        tableView.columns.addAll(nomCol, repCol, poidsCol, muscleCol)

        val scene = javafx.scene.Scene(tableView, 800.0, 600.0)
        primaryStage.scene = scene
        primaryStage.show()

    }
}

fun main() {
    Application.launch(SuiviSportifGUI::class.java)
}
