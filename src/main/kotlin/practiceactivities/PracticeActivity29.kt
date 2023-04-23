package practiceactivities

fun main() {
    // input
    var numInt = 0
    print("Enter number of integers to be input: ")
    numInt = readln().toInt()

    // array
    var numbers = ArrayList<Int>()

    // loop for ArrayList elements input
    for (i in 1..numInt) {
        print("Enter Number $i: ")
        numbers.add(readln().toInt())
    }

    // loop for finding the maximum and minimum values in ArrayList
    var numbersSize = numbers.size - 1      // to ask
    var numMax = numbers[0]
    var numMin = numbers[0]

    for (j in 0..numbersSize) {
        if (numbers[j] > numMax) {
            numMax = numbers[j]
        }
        if (numbers[j] < numMin) {
            numMin = numbers[j]
        }
    }

    //output
    println("Maximum value in the array is: $numMax")
    println("Minimum value in the array is: $numMin")
}