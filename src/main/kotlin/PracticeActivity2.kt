fun main() {
    // variables
    var length : Float = 0f
    var width : Float = 0f
    var perimeter : Float = 0f
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
    println("Perimeter is $perimeter")
    println("Area is $area")
}