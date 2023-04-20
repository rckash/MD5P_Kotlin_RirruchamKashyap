fun main() {
    // a Kotlin program that prompts the user to enter a positive integer n, and then prints out all the odd numbers from 1 to n. Use repeat statement.
    //variables declaration
    var int : Int = 0
    var answer : Char = 'Y'

    while ((answer == 'Y') || (answer == 'y')) {
        // input
        println("Enter a positive integer: ")
        int = readln().toInt()

        if (int > 0) {      // positive number check
            // process + output
            repeat(int) {counter ->
                if (counter % 2 != 0) {     // conditional statement to check if counter iteration is odd
                    println(counter)
                }
            }
        } else {
            println("Invalid Input: Integer Is Not Positive")
        }

        // restart code option for user
        println("Restart Program [Y/N]?")
        answer = readln().first()
        println("...")
    }

}