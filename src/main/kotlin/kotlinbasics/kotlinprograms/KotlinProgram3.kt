package kotlinbasics.kotlinprograms

fun main() {
    //implicit variable declaration
    //var name = "John"
    //the declaration above is similar to -> var name:String = "John"

    //Input - Process - Output
    //for string input
    println("Enter your name: ")
    var name:String = readln()
    println("Hello $name!")

    //for integer input
    println("Enter a number: ")
    var number:Int = readln().toInt()
    println("You have entered the number $number!")
}