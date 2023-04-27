package practiceactivities

fun main() {
//    Create a program that displays the matrix of a number entered by the user. If a user enters 4, it
//    will generate 16 numbers; if 3, it will generate 9 numbers.
//    Arrange the series of numbers in the order just like the sample output.
//    Note: Maximum 3 println() or print() should be used in the solution. Use two looping statements
//    only.Create a program that displays the matrix of a number entered by the user. If a user enters 4, it
//    will generate 16 numbers; if 3, it will generate 9 numbers.
//    Arrange the series of numbers in the order just like the sample output.
//    Note: Maximum 3 println() or print() should be used in the solution. Use two looping statements
//    only.

    // 16   15  14  13
    // 9    10  11  12
    // 8    7   6   5
    // 1    2   3   4

    // input
    var num = 0
    println("Enter matrix to generate (n by n):")
    num = readln().toInt()

    // variables declaration for the two loops
    var matNum = num * num

    // outer loop
    for (i in 1..num) {

        for (j in 1..num) {

            var itCheck = i % 2     // checker for iteration number

            // inner loop for generation of numbers in the matrix
            if (itCheck == 0) {
                matNum++
                print("$matNum\t")
            } else {
                print("$matNum\t")
                matNum--
            }

        }
        println()
        matNum -= num
    }
    }
