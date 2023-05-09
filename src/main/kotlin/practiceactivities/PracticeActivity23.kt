package kotlinbasics.practiceactivities

fun main() {
    // restart program loop
    var answer : Char = 'Y'
    while ((answer == 'Y') || (answer == 'y')) {
        // array to be filled
        var numbers = ArrayList<Int>()

        // input for array size
        var numInp = 0
        println("Enter number of values you would like to input: ")
        numInp = readln().toInt()

        // input for values inside the array
        if (numInp > 0) {
            var ctr1 = 0
            var evenCheck = 0
            var evenCtr = 0
            while (ctr1 < numInp) {
                println("Enter Number ${ctr1 + 1}: ")
                numbers.add(readln().toInt())

                evenCheck = numbers[ctr1] % 2       // checking for even numbers

                if (evenCheck == 0) {               // counter for even numbers
                    evenCtr += 1
                }
                ctr1++
            }

            // array and even numbers counted output
            println("Array contains values $numbers")
            println("The number of even numbers are: $evenCtr")

        } else {
            println("Input can not be zero or negative.")
        }

        // Restart Program Loop input
        println("Restart Program? [Y/N]")
        answer = readln().first()
        println("**************************")
    }

}