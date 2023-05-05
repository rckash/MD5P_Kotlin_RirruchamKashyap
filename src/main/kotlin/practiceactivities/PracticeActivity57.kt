fun main() {
    var num1: Int = 0
    var num2: Int = 0
    while (true) {
        try {
            //variables
            var elements = 5
            var factorial = 1
            val listForPrg = listOf<Int>(1,2,5,7,8)

            //input
            print("Enter Number Index to be displayed: ")
            var num1 = readln().toInt()

            //process
            if ((num1 < 0) || (num1 > 4)) {
                throw Exception()
            }


            //output
            println(listForPrg[num1])
//            println("Number at Index $num1 is: ${getNumber[num1]}")
            break
        } catch (e: Exception) {
            println("\nError: Index out of bounds. Please enter an index between 0 and 4.")
            println("Restarting Program...\n")
        }
    }
}