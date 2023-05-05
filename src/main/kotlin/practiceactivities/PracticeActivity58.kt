fun main() {
    var num1: Int = 0
    var num2: Int = 0
    while (true) {
        try {
            //input
            print("Enter First Integer: ")
            var num1 = readln().toInt()
            print("Enter Second Integer: ")
            var num2 = readln().toInt()

            //process
            var getSum = { num1: Int, num2: Int -> num1 + num2 }
            var getDifference = { num1: Int, num2: Int -> num1 - num2 }
            var getProduct = { num1: Int, num2: Int -> num1 * num2 }
            var getQuotient = { num1: Int, num2: Int -> num1 / num2 }

            //output
            println("Sum is: ${getSum(num1, num2)}")
            println("Difference is: ${getDifference(num1, num2)}")
            println("Product is: ${getProduct(num1, num2)}")
            println("Quotient is: ${getQuotient(num1, num2)}")
            break
        }  catch (exception: NumberFormatException) {
            println("\nError: Arithmetic overflow. The result of the operation exceeds the maximum value of an integer.\n")
            println("Restarting Program...\n")
        }
    }
}