package kotlinbasics.practiceactivities

fun main () {
    // variables
    var studentName : String = ""
    var unitsEnrolledNum : Float = 0f
    var pricePerUnit : Float = 0f
    var tuitionFee : Float = 0f
//    var paymentOption : Int = 0
    var cashPayment : Float = 0f
    var installment2 : Float = 0f
    var installment3 : Float = 0f


    // input
    println("Enter name of Student: ")
    studentName = readln()
    println("Enter number of units enrolled: ")
    unitsEnrolledNum = readln().toFloat()
    println("Enter price per unit: ")
    pricePerUnit = readln().toFloat()
//    println("select payment option: ")
//    println("[1] Cash \n[2] Installments \n[3] 3 Installments")
//    paymentOption = readln().toInt()

    // process
    tuitionFee = unitsEnrolledNum * pricePerUnit
    cashPayment = tuitionFee * 0.90f
    installment2 = tuitionFee * 1.05f / 2f
    installment3 = tuitionFee * 1.10f / 3f

    // output
    println("$studentName, you could avail the following payment mode:")
    println("Computed Tuition Fee: ${String.format("%.2f",tuitionFee)}")
    println("Payment Mode: ")
    println("Cash Payment: ${String.format("%.2f",cashPayment)}")
    println("2-installment: ${String.format("%.2f",installment2)}")
    println("3-installment: ${String.format("%.2f",installment3)}")


//    when (paymentOption) {
//        1 -> println("1")
//        2 -> println("2")
//        3 -> println("3")
//        else -> {
//            println("Invalid option")
//    }
//    }

}