fun main() {
    // Kotlin program that will accept 5 numbers and display the average
    // variables declaration
    var counter : Int = 1
    var num : Int = 0
    var total : Int = 0
    var average : Float = 0f

    // num input & total calculation
    while (counter < 6) {
        println("Enter Number $counter: ")
        num = readln().toInt()
        total+=num
        counter++
    }

    // average calculation
    average = total.toFloat() / 5
    println("Average is $average")


}