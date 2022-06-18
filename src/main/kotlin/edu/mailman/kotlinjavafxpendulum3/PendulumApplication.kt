package edu.mailman.kotlinjavafxpendulum3

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class PendulumApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(PendulumApplication::class.java.getResource("pendulum-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 300.0, 300.0)
        stage.title = "Pendulum"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(PendulumApplication::class.java)
}