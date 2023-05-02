package practiceactivities

//Write a function called findFactorial() that takes in a positive integer n
// and returns the factorial of n, which is the product of all positive integers from 1 to n.
//Sample Input/Output
//Enter a positive integer: 5
//Factorial: 120

fun main() {
    //input
    print("Enter a positive integer: ")
    var posInt = readln().toInt()

    //return value storage
    var factorial = findFactorial(posInt)

    //output
    println("Factorial: $factorial")
}

fun findFactorial(posInt: Int): Int {
    var factorial = 1
    for (i in 1..posInt) {
        factorial *= i
    }

    return factorial
}