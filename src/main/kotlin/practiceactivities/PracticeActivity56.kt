fun main() {
    var num1: Int = 0
    var num2: Int = 0
    while (true) {
        try {
            //input
            print("Enter Positive Integer: ")
            var num1 = readln().toInt()

            //process
            if (num1 == 0) {
                throw Exception()
            }
            var getFactorial = { num1: Int ->
                var factorial = 1
                for (i in 1.. num1) {
                    factorial *= i
                }
                factorial
            }

            //output
            println("Factorial is: ${getFactorial(num1)}")
            break
        } catch (e: Exception) {
            println("\nError: Input must not be a negative integer or zero.")
            println("Restarting Program...\n")
        }
    }
}