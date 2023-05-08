package kotlinbasics.practiceactivities

fun main() {
    // variables
    var length : Float = 0f
    var width : Float = 0f
    var perimeter : Float = 0.00f
    var area : Float = 0f

    // input
    println("Enter length: ")
    length = readln().toFloat()
    println("Enter width: ")
    width = readln().toFloat()

    // process
    perimeter = 2 * length + 2 * width
    area = length * width

    // output
    println("Perimeter is ${String.format("%.2f",perimeter)}")    //formats float to show 2 decimal values
    println("Area is ${String.format("%.3f",perimeter)}")    //formats float to show 3 decimal values
}