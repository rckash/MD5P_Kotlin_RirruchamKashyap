fun main() {
    // declare all variables
    var num1 : Int = 0
    var num2 : Int = 0
    var sum : Int = 0
    var difference : Int = 0
    var product : Int = 0
    var quotient : Int = 0
    var modulo : Int = 0

    // input
    println("Enter 1st number: ")
    num1 = readln().toInt()
    println("Enter 2nd number: ")
    num2 = readln().toInt()

    // process
    sum = num1 + num2
    difference = num1 - num2
    product = num1 * num2
    quotient = num1 / num2
    modulo = num1 % num2

    //output
    println("The sum is $sum")
    println("The difference is $difference")
    println("The product is $product")
    println("The quotient is $quotient")
    println("The modulo is $modulo")
}