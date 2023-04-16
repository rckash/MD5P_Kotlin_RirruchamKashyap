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
    if ((num1 * num1 + num2 * num2) == (num3 * num3)){
        println("These numbers form a Pythagorean triple.")
    } else {
        println("These numbers do not form a Pythagorean triple.")
    }

}