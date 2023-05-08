package kotlinbasics.practiceactivities
fun main() {
    println("Enter number of integers to be input: ")
    var numInp = readln().toInt()
    //varargs - variable-length argument list
    println(String.format("%.2f", calculateAverage(numInp)))
}

fun calculateAverage(numInp: Int,vararg numbers: Int): Double {
    var total: Double = 0.0
    for (i in 1..numInp) {
        println("Enter number $i")
        var num = readln().toInt()
        total += num
    }
    total /= numInp
    return total
}