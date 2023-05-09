package kotlinbasics.practiceactivities

fun main() {
//    Create a program that can convert fahrenheit to celsius or vice versa. After computing the
//            conversion values, the program returns to the Main Menu. Use the following formula for the
//    conversion:
//    Sample Input/Output:
//    Main Menu
//    a. Celsius to Fahrenheit
//    b. Fahrenheit to Celsius
//    c. Exit
//    Choose option [a, b, or c]: a


    // main menu choice process
    for (i in 1..10) {
        // main menu
        var choice = 'a'
        println("Main Menu")
        println("a. Celsius to Fahrenheit")
        println("b. Fahrenheit to Celsius")
        println("c. Exit")
        print("Choose option [a, b, c]: ")
        choice = readln().first()
        println()

        var fahrenheit = 0f
        var celsius = 0f
        when (choice) {
            'a' -> {
                println("Celsius to Fahrenheit Conversion")
                print("Enter Celsius: ")
                celsius = readln().toFloat()
                fahrenheit = 9f / 5f * celsius + 32f
                println("Fahrenheit equivalent is: ${String.format("%.2f", fahrenheit)}")
            }

            'b' -> {
                println("Fahrenheit to Celsius Conversion")
                print("Enter Fahrenheit: ")
                fahrenheit = readln().toFloat()
                celsius = (fahrenheit - 32f) * 5f / 9f
                println("Celsius equivalent is: ${String.format("%.2f", celsius)}")
            }
            'c' -> {
                println("Exiting Program...")
                break
            }

            else -> {
                println("Error: Choose option from [a, b, c] \n")
                continue
            }
        }
        println("\n")
        continue
    }

}