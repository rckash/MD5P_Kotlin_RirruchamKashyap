package kotlinbasics.practiceactivities

fun main() {
    // variables
    var num : Int = 0

    // input
    println("Enter a number: ")
    num = readln().toInt()

    // process + output
    if (num % 2 == 0) {
        println("The number is even.")
    } else {
        println("The number is odd.")
    }
}