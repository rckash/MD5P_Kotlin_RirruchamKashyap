package kotlinbasics.practiceactivities

fun main() {
    // variables
    var commodityItem : String = "gasoline"
    var priceDay1 : Float = 39.99f
    var priceDay2 : Float = 40.02f
    var priceDay3 : Float = 38.97f
    var averagePrice : Float = 0f

    // input
    println("Enter item name: ")
    commodityItem = readln()
    println("Price in Day 1: ")
    priceDay1 = readln().toFloat()
    println("Price in Day 2: ")
    priceDay2 = readln().toFloat()
    println("Price in Day 3: ")
    priceDay3 = readln().toFloat()


    // process
    averagePrice = (priceDay1 + priceDay2 + priceDay3) / 3

    // output
    println("The average price of $commodityItem is ${String.format("%.2f",averagePrice)} per gallon" )
}