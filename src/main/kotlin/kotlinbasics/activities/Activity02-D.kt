package kotlinbasics.activities

fun main() {
    while (true) {
        try {
            //variables declaration
            var monetaryValues = mutableListOf<Double>()
            var monetaryNum = 5

            //input
            for (i in 1..monetaryNum) {
                print("Input Monetary Value #$i: ")
                monetaryValues.add(readln().toDouble())
            }
            print("\nDivide total value by how many? ")
            var divisor = readln().toDouble()

            //process
            var total = monetaryValues.sum()
            var quotient = total / divisor

            //output
            println("Monetary Total is ${String.format("%.1f",total)}")
            println("Quotient is ${String.format("%.1f",quotient)}")
            break
        } catch (e:NumberFormatException) {
            println("\nError: Input can only be numerics.")
            println("Restarting Program...\n")
        }
    }
}