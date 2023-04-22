package practiceactivities

fun main() {
    // variables declaration
    var ctr1 = 0
    var numCol1 = 25
    var numCol2 = 20
    var numCol3 = 15
    var numCol4 = 10
    var numCol5 = 5

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