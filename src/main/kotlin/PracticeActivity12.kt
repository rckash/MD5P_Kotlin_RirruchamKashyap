fun main() {
    // variables
    var farePrice : Float = 0f
    var passengerType : String = ""
    var discountPrice : Float = 0f
    var businessClassCheck : String = ""
    var isBusinessClass : Boolean = false
    var businessClassCharge : Float = 0f

    // input
    println("Enter fare: ")
    farePrice = readln().toFloat()
    println("Passenger Type [O,S,C]: ")
    passengerType = readln()
    println("Travelling in Business Class? [Y/N]: ")
    businessClassCheck = readln()

    // process
    if (businessClassCheck == "Y") {
        isBusinessClass = true
    } else {
        isBusinessClass = false
    }

    when (passengerType) {
        "O" -> {
            discountPrice = 0f
            farePrice -= discountPrice
            if (isBusinessClass == true) {
                businessClassCharge = 1000f
                farePrice += businessClassCharge
            }
        }
        "S" -> {
            discountPrice = farePrice * 0.05f
            farePrice -= discountPrice
            if (isBusinessClass == true) {
                businessClassCharge = 700f
                farePrice += businessClassCharge
            }
        }
        "C" -> {
            discountPrice = farePrice * 0.1f
            farePrice -= discountPrice
            if (isBusinessClass == true) {
                businessClassCharge = 500f
                farePrice += businessClassCharge
            }
        }
    }

    // output
    println("Discount is ${String.format("%.2f",discountPrice)}")
    println("Business Class charge is ${String.format("%.2f",businessClassCharge)}")
    println("New fare is ${String.format("%.2f",farePrice)}")
}