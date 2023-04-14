fun main() {
    // variables
    var inputUsersName : String = ""
    val currentYear : Int = 2023
    var userBirthYear : Int = 0
    var userAge : Int = 0

    // input
    println("What is your name? ")
    inputUsersName = readln()
    println("What is your birth year? ")
    userBirthYear = readln().toInt()

    // process
    userAge = currentYear - userBirthYear

    // output
    println("$inputUsersName, your age on $currentYear is $userAge")
}