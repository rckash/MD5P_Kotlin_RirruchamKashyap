package kotlinbasics.practiceactivities

fun main() {
    // input
    var matrix = mutableListOf(
        //      0   1   2
        mutableListOf(0,0,0), // 0
        mutableListOf(0,0,0), // 1
        mutableListOf(0,0,0), // 2
    )
    println(matrix.size) // get the number of rows

    var row = 0
    var inputNumber = 1
    // loop for input to matrix
    while (row < matrix.size) {
        var column = 0
        while (column < matrix[row].size) {
            println("Enter number $inputNumber: ")
            var input = readln().toInt()
            matrix[row][column] = input
            column++
            inputNumber++
        }
        row++
    }
    // loop for displaying matrix
    row = 0
    while (row < matrix.size) {
        var column = 0
        while (column < matrix[row].size) {
            print("${matrix[row][column]} \t")
            column++
        }
        row++
        println()
    }
}
