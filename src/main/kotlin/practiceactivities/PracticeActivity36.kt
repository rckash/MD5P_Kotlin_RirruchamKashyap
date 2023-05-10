package practiceactivities

fun main() {
    // input
    var matrix = mutableListOf(
        //      0   1   2
        mutableListOf(0, 0, 0), // 0
        mutableListOf(0, 0, 0), // 1
        mutableListOf(0, 0, 0), // 2
    )

    // variables for
    var row = 0
    var inputNumber = 1
    var magicSquareNumber = 15
    var magicSquareCheck = true
    var verticalSum = 0
    var horizontalSum = 0
    var totalSum = 0
    var diagonalSum = 0

    // loop for input to matrix
    while (row < matrix.size) {
        var column = 0
        var input = 0
        while (column < matrix[row].size) {
            println("Enter number $inputNumber: ")
            input = readln().toInt()
            column++
            inputNumber++
        }
        row++
    }

    // check for magic square
    row = 0
    while (row < matrix.size) {
        var column = 0
        while (column < matrix[row].size) {
//            var horizontalCheck = 0
//            matrix[row][column] = horizontalCheck
//            horizontalSum += horizontalCheck
            column++
        }
        if (horizontalSum != magicSquareNumber) {
            magicSquareCheck = false
        }
//        totalSum += matrix[row][column]
        row++
    }
    println(horizontalSum)
    println(totalSum)

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

    println("Magic Square is $magicSquareCheck")
    }

