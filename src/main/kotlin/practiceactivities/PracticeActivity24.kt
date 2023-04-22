package practiceactivities

fun main() {
    //variables declaration
    var num = 2
    var numTotal = 0
    var square = 0
    var squareTotal = 0
    var cube = 0
    var cubeTotal = 0
    var ctr1 = 1

    // table head
    println("Number\tSquare\tCube")

    while (ctr1 < 6) {
        // calculation for rows
        num = ctr1 * 2
        square = num * num
        cube = num * num * num

        // calculation for totals
        numTotal += num
        squareTotal += square
        cubeTotal += cube

        // num output
        println("$num\t$square\t$cube")

        ctr1++
    }

    // total output
    println("Total\t$squareTotal\t$cubeTotal")
}