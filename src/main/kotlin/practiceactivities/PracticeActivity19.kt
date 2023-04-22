fun main() {
    // a Kotlin program that prompts the user to enter a positive integer n, and then prints out the factorial of n. Use do-while statement.
    // variables declaration
    var counter : Int = 0
    var int : Int = 0
    var product : Int = 1
    var answer : Char = 'Y'

    while ((answer == 'Y') || (answer == 'y')) {
        // input
        println("Enter a positive integer: ")
        int = readln().toInt()
        counter = int

        if (int > 0) {      // positive number check
        // process
        do {                        // conditional statement for multiplying int
            product *= counter
            counter--
        } while (counter > 0)

        // output
        println("The factorial of $int is $product")
        } else {
            println("Invalid Input: Integer Is Not Positive")
        }

        // restart code option for user
        println("Restart Program [Y/N]?")
        answer = readln().first()
        println("...")
    }
}