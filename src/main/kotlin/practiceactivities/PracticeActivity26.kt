package kotlinbasics.practiceactivities

fun main() {
    // variables declaration
    var columns = 5
    var num = 25
    var numGenY = num
    var numGenX = num

    // outer loop
    var ctr1 = 0
    for (i in 1..columns) {

        // inner loop
        for (i in 1..columns) {
            print("$numGenX\t")
            numGenX -= 5
        }

        // setting value for column
        numGenY -= 1
        numGenX = numGenY
        println()
    }
}