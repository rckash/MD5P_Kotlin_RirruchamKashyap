package kotlinbasics.practiceactivities

fun main() {
    // variables
    var inputUsersName : String = ""
    var currentYear : Int = 2023
    var userBirthYear : Int = 0
    var userAge : Int = 0

    // input
    println("What is your name? ")
    inputUsersName = readln()
    println("Enter current year: ")
    currentYear = readln().toInt()
    println("Enter birth year: ")
    userBirthYear = readln().toInt()

    // process
    userAge = currentYear - userBirthYear

    // output
    println("$inputUsersName, your age on $currentYear is $userAge")
}