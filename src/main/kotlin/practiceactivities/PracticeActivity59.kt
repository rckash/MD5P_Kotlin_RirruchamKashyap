fun main() {
    //variable
    var num1: Int = 0

    while (true) {
        try {
            //input
            print("Enter Positive Integer: ")
            var num1 = readln().toDouble()

            //process
            var convertToInt = { num1: Double -> num1.toInt() }

            //output
            println("$num1 converted to decimal is: ${convertToInt(num1)}")
            break
        } catch (e: Exception) {
            println("\nError: Input must be a numeric value only.")
            println("Restarting Program...\n")
        }
    }
}