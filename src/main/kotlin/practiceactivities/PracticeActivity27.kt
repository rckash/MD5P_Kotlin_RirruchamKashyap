package practiceactivities

fun main() {
    // input
    var num = 0
    println("Enter matrix to generate (n by n):")
    num = readln().toInt()

    // variables declaration for the two loops
    var ctr1 = 0
    var matNum = num * num
    var matNumX = matNum
    var matNumY = matNum

    // outer loop
    for (i in 1..num) {

        for (j in 1..num) {

            var itCheck = i % 2     // checker for iteration number

            // inner loop for generation of numbers in the matrix
            if (itCheck == 0) {
                matNumX++
                print("$matNumX\t")
            } else {
                print("$matNumX\t")
                matNumX--
            }

        }
        println()
        matNumX -= num
    }
    }
