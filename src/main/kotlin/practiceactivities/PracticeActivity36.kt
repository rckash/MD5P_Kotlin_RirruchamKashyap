package practiceactivities

fun main() {
    // input
    var matrix = mutableListOf(
        //      0   1   2
        mutableListOf(0, 0, 0), // 0
        mutableListOf(0, 0, 0), // 1
        mutableListOf(0, 0, 0), // 2
    )

    // variables declaration
    var row = 0
    var inputNumber = 1
    var magicSquareNumber = 15
    var magicSquareCheck = true
    var input = 0

    // loop for input to matrix
    while (row < matrix.size) {
        var column = 0
        while (column < matrix[row].size) {
            println("Enter number $inputNumber: ")
            input = readln().toInt()
            matrix[row][column] = input
            column++
            inputNumber++
        }
        row++
    }

    // check for magic square
    row = 0
    var columnCheck1 = 0
    var columnCheck2 = 0
    var columnCheck3 = 0
    var diagonalRightCheck = 0
    var diagonalLeftCheck = 0

    while (row < matrix.size) {
        var column = 0
        var rowCheck = 0

        while (column < matrix[row].size) {
            rowCheck += matrix[row][column]

            if (column == 0){
                columnCheck1 += matrix[row][column]
                println("column1 = $columnCheck1")
                if (row == 0) {
                    diagonalRightCheck += matrix[row][column]
                    println("diagonal = $diagonalRightCheck")
                }
                if (row == 2) {
                    diagonalLeftCheck += matrix[row][column]
                    println("diagonalL = $diagonalLeftCheck")
                }

            } else if (column == 1){
                columnCheck2 += matrix[row][column]
                println("column2 = $columnCheck2")
                if (row == 1) {
                    diagonalRightCheck += matrix[row][column]
                    println("diagonal = $diagonalRightCheck")

                    diagonalLeftCheck += matrix[row][column]
                    println("diagonalL = $diagonalLeftCheck")
                }
            } else if (column == 2){
                columnCheck3 += matrix[row][column]
                println("column3 = $columnCheck3")
                if (row == 2) {
                    diagonalRightCheck += matrix[row][column]
                    println("diagonal = $diagonalRightCheck")
                }
                if (row == 0) {
                    diagonalLeftCheck += matrix[row][column]
                    println("diagonalL = $diagonalLeftCheck")
                }
            }

            column++
        }

        if (rowCheck != magicSquareNumber){
            magicSquareCheck = false
        }

        row++
        println()
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


    println("Magic Square is $magicSquareCheck")
    }

