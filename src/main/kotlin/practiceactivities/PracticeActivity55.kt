fun main() {
    var num1: Double = 0.0
    var num2: Double = 0.0
    while (true) {
        try {
            //input
            print("Enter First Integer: ")
            var num1 = readln().toDouble()
            print("Enter Second Integer: ")
            var num2 = readln().toDouble()

            //process
            var divide = { num1: Double, num2: Double -> num1 / num2 }

            //output
            println("Quotient is: ${divide(num1, num2)}")
            break
        } catch (exception: Exception) {
            println("\nError: Input must be an integer.")
            println("Restarting Program...\n")
        }
    }
}