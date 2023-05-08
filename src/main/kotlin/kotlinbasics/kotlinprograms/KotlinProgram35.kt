package kotlinbasics.kotlinprograms

fun main() {
    //challenge1.kt
    var number1 : Int = 0
    var number2 : Int = 0
    var inputNum = 0
    var restart = 'y'
    //Exception handling - try and catch
    while ((restart == 'y') || (restart =='Y')) {
        try {
            println("***********************")
            println("Simple Calculator")
            println("***********************")
            println("Enter number 1: ")
            number1 = readln().toInt()
            println("Enter number 2: ")
            number2 = readln().toInt()
            println("The quotient is ${number1 / number2}")
        } catch (exception: Exception) {
            println("Wrong Input! Integer Inputs only!")
            println("Restarting Program\n")
            continue
        }
        println("This is a test")
        println("Restart program (Y/N)?")
        restart  = readln().first()
    }
}
