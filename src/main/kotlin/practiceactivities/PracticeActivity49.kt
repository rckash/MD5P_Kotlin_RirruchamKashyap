package kotlinbasics.practiceactivities

fun main() {
    //input
    println("Enter Length: ")
    var length = readln().toDouble()
    println("Enter Width: ")
    var width = readln().toDouble()

    //function return values storage
    var area = length calculateArea width
    var perimeter = length calculatePerimeter width

    //output
    println("The area of the rectangle is $area")
    println("The perimeter of the rectangle is $perimeter")

}

infix fun Double.calculateArea(thisDouble: Double): Double {
    var area = this * thisDouble
    return area
}

infix fun Double.calculatePerimeter(thisDouble: Double): Double {
    var perimeter = this * 2 + thisDouble * 2
    return perimeter
}