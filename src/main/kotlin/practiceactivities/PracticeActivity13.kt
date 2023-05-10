package practiceactivities

import kotlin.math.pow

fun main() {
    // variables
    var weight : Float = 0f
    var height : Float = 0f
    var bmi : Float = 0f
    var category : String = ""

    // input
    println("Enter weight (in kilograms): ")
    weight = readln().toFloat()
    println("Enter height (in meters): ")
    height = readln().toFloat()

    // process
    // bmi calculation
    bmi = weight / height.pow(2)
    // category determination
    if (bmi > 30) {
        category = "Obese"
    } else if (bmi > 25) {
        category = "Overweight"
    } else if (bmi > 18.5) {
        category = "Normal Weight"
    } else if (bmi > 0) {
        category = "Underweight"
    } else {
        category = "Invalid: negative or zero input(s)"
    }

    // output
    println("Weight: ${String.format("%.2f",weight)}")
    println("Height: ${String.format("%.2f",height)}")
    println("BMI: ${String.format("%.2f",bmi)}")
    println("BMI Category: $category")
}