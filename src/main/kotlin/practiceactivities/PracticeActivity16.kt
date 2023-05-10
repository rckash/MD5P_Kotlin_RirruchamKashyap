package practiceactivities

fun main() {
    // variables
    var num1 : Int = 0
    var num2 : Int = 0
    var num3 : Int = 0

    // input
    println("Enter the first number: ")
    num1 = readln().toInt()
    println("Enter the second number: ")
    num2 = readln().toInt()
    println("Enter the third number: ")
    num3 = readln().toInt()

    // process + output
    if ((num1 <= num2) && (num1 <= num3)){
        println("The smallest number is $num1")
    } else if ((num2 <= num1) && (num1 <= num3)) {
        println("The smallest number is $num2")
    } else {
        println("The smallest number is $num3")
    }
}