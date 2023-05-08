package kotlinbasics.practiceactivities

fun main() {
    // variable
    var num : Int = 0

    // input
    println("Enter a number between 1 and 7: ")
    num = readln().toInt()

    // process + output
    when (num) {
        1 -> {
            println("Day 1 is Monday")
        }
        2 -> {
            println("Day 2 is Tuesday")
        }
        3 -> {
            println("Day 3 is Wednesday")
        }
        4 -> {
            println("Day 4 is Thursday")
        }
        5 -> {
            println("Day 5 is Friday")
        }
        6 -> {
            println("Day 6 is Saturday")
        }
        7 -> {
            println("Day 7 is Sunday")
        }
        else -> {
            println("Invalid number! Please enter a number between 1 and 7.")
        }
    }
}