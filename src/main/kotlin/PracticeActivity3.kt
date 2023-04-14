fun main() {
    // variables
    var commodityItem : String = "gasoline"
    var priceDay1 : Float = 39.99f
    var priceDay2 : Float = 40.02f
    var priceDay3 : Float = 38.97f
    var averagePrice : Float = 0f

    // process
    averagePrice = (priceDay1 + priceDay2 + priceDay3) / 3

    // output
    println("The average price of $commodityItem is $averagePrice per gallon" )
}