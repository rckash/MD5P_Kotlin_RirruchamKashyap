package kotlinbasics.practiceactivities

//Write a function called convertTemperature() that takes in a temperature in Celsius and returns the equivalent temperature in Fahrenheit.
//The formula for converting Celsius to Fahrenheit is (Celsius * 9/5) + 32.
//
//Sample Input/Output
//Temperature (Celsius): 25
//Temperature (Fahrenheit): 77.0

fun main() {
    //input
    print("Enter temperature (Celsius): ")
    var tempCelsius = readln().toDouble()

    //return value storage
    var tempFar = convertTemperature(tempCelsius)

    //output
    println("Temperature (Fahrenheit): $tempFar")
}

fun convertTemperature(tempCelsius: Double): Double {
    var tempFar = tempCelsius * 9 / 5 + 32

    return tempFar
}