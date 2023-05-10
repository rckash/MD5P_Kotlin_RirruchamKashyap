package practiceactivities

fun main() {
    // variable
    var productName : String = ""
    var salesPrice : Float = 0f
    var discountPrice : Float = 0f
    var netPrice : Float = 0f

    // input
    println("Enter product name: ")
    productName = readln()
    println("Enter sales price: ")
    salesPrice = readln().toFloat()

    // process + output
    if (salesPrice >= 100000) {
        discountPrice = salesPrice * 0.2f
    } else if (salesPrice >= 50001) {
        discountPrice = salesPrice * 0.15f
    } else if (salesPrice >= 20001) {
        discountPrice = salesPrice * 0.1f
    } else if (salesPrice >= 10001) {
        discountPrice = salesPrice * 0.05f
    } else if (salesPrice >= 0) {
        discountPrice = salesPrice
    } else {
        println("Invalid sales price: Please enter a positive number.")
        salesPrice = 0f
    }
    netPrice = salesPrice - discountPrice

    // output
    println("Price of $productName is ${String.format("%.2f", salesPrice)}")
    println("Discount is ${String.format("%.2f", discountPrice)}")
    println("Net price is ${String.format("%.2f", netPrice)}")
}