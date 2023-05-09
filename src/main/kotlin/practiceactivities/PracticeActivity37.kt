package kotlinbasics.practiceactivities

fun main() {
    //input
    println("Enter Length: ")
    var length = readln().toDouble()
    println("Enter Width: ")
    var width = readln().toDouble()

    //function return values storage
    var area = calculateArea(length, width)
    var perimeter = calculatePerimeter(length, width)

    //output
    println("The area of the rectangle is $area")
    println("The perimeter of the rectangle is $perimeter")

}

fun calculateArea(length: Double, width: Double): Double {
    var area = length * width
    return area
}

fun calculatePerimeter(length: Double, width: Double): Double {
    var perimeter = length * 2 + width * 2
    return perimeter
}