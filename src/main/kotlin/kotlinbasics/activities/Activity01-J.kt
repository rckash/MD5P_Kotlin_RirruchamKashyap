package kotlinbasics.activities

fun main() {
    //data
    var priceMap = hashMapOf<String, Double>()
    priceMap.put("SOAP", 7.5)
    priceMap.put("BREAD", 40.0)
    priceMap.put("OATS", 50.55)
    priceMap.put("WATER", 9.95)

    var cartMap = hashMapOf<String, Int>()

    //input + process
    var inputMore = 'y'
    var totalPrice:Double = 0.0
    while ((inputMore == 'y') || (inputMore == 'Y'))  {
        println("Enter Item Name: ")
        var item = readln().uppercase()
        println("Enter Amount of Item: ")
        var itemAmount = readln().toInt()

        cartMap.put(item,itemAmount)                                //input item and amount to new hashmap for printing later

        totalPrice += (priceMap.get(item)!!) * itemAmount          //calculation for total price of bought items

        println("Input more items? ")
        inputMore = readln().first()
    }

    //output
    println(cartMap.entries)                                        // display items bought and amount of each

    println("Total Price: ${String.format("%.2f", totalPrice)}")
}