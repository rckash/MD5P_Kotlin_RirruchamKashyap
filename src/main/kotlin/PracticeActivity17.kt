fun main() {
    // Kotlin program that will accept 5 numbers and display the average
    // variables declaration
    var counter : Int = 0
    var num : Int = 0
    var total : Int = 0
    var average : Float = 0f

    // num input & total calculation
    while (counter < 5) {
        println("Enter Number ${counter + 1}: ")
        num = readln().toInt()
        total+=num
        counter++
    }

    // average calculation
    average = total.toFloat() / 5

    // output
    println("Average is ${String.format("%.2f",average)}")
}