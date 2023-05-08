package kotlinbasics.practiceactivities

fun main() {
    //input
    println("Enter Length: ")
    var length = readln().toDouble()
    println("Enter Width: ")
    var width = readln().toDouble()

    //function return values storage
    var area = { length: Double, width: Double ->
        var area = length * width
        area.toDouble()
    }
    var perimeter = { length: Double, width: Double ->
        var perimeter = length * 2 + width * 2
        perimeter.toDouble()
    }

    //output
    println("The area of the rectangle is ${String.format("%.2f",area(length, width))}")
    println("The perimeter of the rectangle is ${String.format("%.2f",perimeter(length, width))}")

}
