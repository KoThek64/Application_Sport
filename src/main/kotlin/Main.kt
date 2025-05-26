package org.example

import javafx.application.Application
import javafx.beans.property.SimpleDoubleProperty
import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Insets
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.layout.BorderPane
import javafx.scene.layout.VBox
import javafx.stage.Stage


class SuiviSportifGUI : Application() {
    private val gestionExercice = GestionExercice()
    private val tableView = TableView<Exercice>()

    override fun start(primaryStage: Stage) {
        primaryStage.title = "Suivi sportif"
        primaryStage.minWidth = 800.0
        primaryStage.minHeight = 600.0

        val idCol = TableColumn<Exercice, Number>("ID")
        idCol.setCellValueFactory { SimpleIntegerProperty(it.value.id) }

        val nomCol = TableColumn<Exercice, String>("Nom")
        nomCol.setCellValueFactory { SimpleStringProperty(it.value.nom) }

        val repCol = TableColumn<Exercice, Number>("Répétitions")
        repCol.setCellValueFactory { SimpleIntegerProperty(it.value.repetition) }

        val poidsCol = TableColumn<Exercice, Number>("Poids")
        poidsCol.setCellValueFactory { SimpleDoubleProperty(it.value.poids) }

        val muscleCol = TableColumn<Exercice, String>("Muscles")
        muscleCol.setCellValueFactory { SimpleStringProperty(it.value.muscle.joinToString()) }

        tableView.columns.addAll(idCol, nomCol, repCol, poidsCol, muscleCol)
        tableView.columnResizePolicy = TableView.CONSTRAINED_RESIZE_POLICY_ALL_COLUMNS

        val btnAdd = Button("Ajouter")
        val btnSupp = Button("Supprimer")
        val btnVoirStats = Button("Statistiques")
        val btnQuitter = Button("Quitter")

        val buttonBox = VBox(10.0).apply {
            children.addAll(btnAdd,btnSupp,btnVoirStats,btnQuitter)
            style = """
                -fx-padding: 15;
                -fx-alignment: CENTER;
            """
        }

        val root = BorderPane().apply {
            left = buttonBox
            center = tableView
            style = "-fx-background-color: #f5f5f5;"
            BorderPane.setMargin(tableView, Insets(10.0))
            BorderPane.setMargin(buttonBox, Insets(0.0, 10.0, 0.0, 10.0))
        }

        val scene = Scene(root, 800.0, 600.0)
        primaryStage.scene = scene
        primaryStage.show()

    }
}

fun main() {
    Application.launch(SuiviSportifGUI::class.java)
}
