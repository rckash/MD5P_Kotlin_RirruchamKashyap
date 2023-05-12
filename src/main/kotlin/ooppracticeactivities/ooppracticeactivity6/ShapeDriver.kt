package ooppracticeactivities.ooppracticeactivity6

fun main() {
    //first constructor
    println("First Constructor")
    val shape1 = Shape()
    println(shape1.length)
    println(shape1.width)

    //second constructor
    println("Second Constructor")
    val shape2 = Shape(25, 25)
    println(shape2.length)
    println(shape2.width)
}