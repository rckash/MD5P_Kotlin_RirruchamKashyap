fun main() {
    // if statement
    // variables
    var age : Int = 0
    // < > <= >= == !=

    // input
    println("Please Enter your age: ")
    age = readln().toInt()

    // process + output
    if(age >= 18) {
        println("Your age is $age")
        println("You are qualified to vote!")
    }
    println("This will always display")
}