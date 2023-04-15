fun main() {
    // variable
    var num : Int = 0

    // input
    println("Enter a number: ")
    num = readln().toInt()

    //process + output
    if (num > 0) {
        println("The number is positive.")
    } else if (num < 0) {
        println("The number is negative.")
    } else {
        println("The number is zero.")
    }
}