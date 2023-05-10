package practiceactivities

//Write a function called calculateBMI() that takes in a person's weight in kilograms and height in meters, and returns their body mass index (BMI).
// The formula for BMI is weight (kg) / (height (m) * height (m)).
//
//Sample Input/Output
//Weight (kg): 68
//Height (m): 1.75
//
//BMI: 22.20

fun main() {
    //input
    print("Enter Weight (kg): ")
    var weight: Double = readln().toDouble()
    print("Enter Height (m): ")
    var height: Double = readln().toDouble()

    //return value storage
    var bmi = { weight: Double, height: Double -> weight / ( height * height ) }

    //output
    println("BMI: ${String.format("%.2f",bmi(weight, height))}")
}