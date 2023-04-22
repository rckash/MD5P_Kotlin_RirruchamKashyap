fun main() {
    // variable
    var year : Int = 0

    // input
    println("Enter Year: ")
    year = readln().toInt()

    // process + output
    if (year > 0) {
        if (year % 4 == 0) {
            if (!(year % 400 == 0) && (year % 100 == 0)) {
                println("$year is not a leap year.")
            } else {
                println("$year is a leap year.")
            }
        } else {
            println("$year is not a leap year.")
        }
    } else {
        println("Invalid Input: Year must be a positive number.")
    }

}