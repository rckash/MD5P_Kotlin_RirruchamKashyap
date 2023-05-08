package kotlinbasics.practiceactivities

fun main() {
    // variables
    var farePrice : Float = 0f
    var passengerType : Char = 'O'
    var discountPrice : Float = 0f
    var businessClassCheck : Char = 'N'
    var isBusinessClass : Boolean = false
    var businessClassCharge : Float = 0f

    // input
    println("Enter fare: ")
    farePrice = readln().toFloat()
    println("Passenger Type [O,S,C]: ")
    passengerType = readln().first()
    println("Travelling in Business Class? [Y/N]: ")
    businessClassCheck = readln().first()

    // process
    if (businessClassCheck == 'Y') {
        isBusinessClass = true
    } else if (businessClassCheck == 'N') {
        isBusinessClass = false
    } else {
        println("Invalid Input: defaulting choice to N")
    }

    when (passengerType) {
        'O' -> {
            discountPrice = 0f
            farePrice -= discountPrice
            if (isBusinessClass == true) {
                businessClassCharge = 1000f
                farePrice += businessClassCharge
            }
        }
        'S' -> {
            discountPrice = farePrice * 0.05f
            farePrice -= discountPrice
            if (isBusinessClass == true) {
                businessClassCharge = 700f
                farePrice += businessClassCharge
            }
        }
        'C' -> {
            discountPrice = farePrice * 0.1f
            farePrice -= discountPrice
            if (isBusinessClass == true) {
                businessClassCharge = 500f
                farePrice += businessClassCharge
            }
        }
        else -> {
            println("Invalid Passenger Type: defaulting choice to O")
        }
    }

    // output
    println("Discount is ${String.format("%.2f",discountPrice)}")
    println("Business Class charge is ${String.format("%.2f",businessClassCharge)}")
    println("New fare is ${String.format("%.2f",farePrice)}")
}