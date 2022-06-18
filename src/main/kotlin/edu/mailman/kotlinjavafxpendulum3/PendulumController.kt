package edu.mailman.kotlinjavafxpendulum3

import javafx.animation.Animation
import javafx.animation.KeyFrame
import javafx.animation.Timeline
import javafx.scene.shape.Circle
import javafx.scene.shape.Line
import javafx.util.Duration
import kotlin.math.cos
import kotlin.math.sin

const val g = 9.8  // acceleration of gravity
const val dt = 0.1  // time increment
const val length = 150.0  // length of the string

var theta = Math.PI / 8  // angle of the string
var velocity = 0.0  // velocity of the ball
var acceleration = 0.0  // acceleration of the ball

class PendulumController {
    lateinit var linString: Line
    lateinit var cirBall: Circle

    fun initialize() {
        // Set up a timeline
        val timeLine = Timeline(KeyFrame(Duration.millis(10.0), {moveIt()}))
        timeLine.cycleCount = Animation.INDEFINITE
        timeLine.play()

        // Bind the end of the string to the center of the ball
        linString.endXProperty().bind(cirBall.centerXProperty())
        linString.endYProperty().bind(cirBall.centerYProperty())
    }

    private fun moveIt() {
        // Calculate the new acceleration, velocity and amplitude
        acceleration = -g / length * sin(theta)
        velocity += acceleration * dt
        theta += velocity * dt

        // Calculate the new center of the ball
        cirBall.centerX = length * sin(theta)
        cirBall.centerY = length * cos(theta)

        // println(velocity)
    }
}