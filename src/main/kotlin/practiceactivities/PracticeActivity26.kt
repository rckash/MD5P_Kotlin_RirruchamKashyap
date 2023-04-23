package practiceactivities

fun main() {
    // variables declaration
    var ctr1 = 0
    var numCol1 = 25
    var numCol2 = numCol1 - 5
    var numCol3 = numCol2 - 5
    var numCol4 = numCol3 - 5
    var numCol5 = numCol4 - 5
    var num = arrayOf(25, 20, 15, 10, 5)



    // process + output
    while (ctr1 < 5) {
        println("$numCol1\t$numCol2\t$numCol3\t$numCol4\t$numCol5")
        numCol1 -= 1
        numCol2 -= 1
        numCol3 -= 1
        numCol4 -= 1
        numCol5 -= 1
        ctr1++
    }
}