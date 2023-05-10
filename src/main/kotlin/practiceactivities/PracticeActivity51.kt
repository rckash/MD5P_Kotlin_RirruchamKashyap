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
    var fact = { posInt: Int ->
        var factorial = 1
        for (i in 1..posInt) {
            factorial *= i
        }
        factorial.toInt()
    }

    //output
    println("Factorial: ${fact(posInt)}")
}