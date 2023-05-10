package practiceactivities

fun main() {
    // variables
    var num1 : Int = 0
    var num2 : Int = 0
    var num3 : Int = 0
    var leftNum = 0
    var rightNum = 0


    // input
    println("Enter the first number: ")
    num1 = readln().toInt()
    println("Enter the second number: ")
    num2 = readln().toInt()
    println("Enter the third number: ")
    num3 = readln().toInt()

    // process
    leftNum = num1 * num1 + num2 * num2
    rightNum = num3 * num3

    // output
    if (leftNum == rightNum){
        println("These numbers form a Pythagorean triple.")
    } else {
        println("These numbers do not form a Pythagorean triple.")
    }

}