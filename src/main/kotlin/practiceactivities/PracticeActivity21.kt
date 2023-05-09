package kotlinbasics.practiceactivities

fun main() {
    // outerloop
    var ctr1 = 1
    while (ctr1 <= 5) {
        // innerloop
        var ctr2 = 1
        while (ctr2 <= ctr1) {
            print("$ctr2 ")
            ctr2++
        }
        println()
        ctr1++
    }
}