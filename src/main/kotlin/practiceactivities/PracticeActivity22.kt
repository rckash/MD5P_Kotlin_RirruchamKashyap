package practiceactivities

fun main() {
    // outerloop
    var ctr1 = 1
    while (ctr1 <= 5) {
        // innerloop
        var ctr2 = 5
        while (ctr2 >= ctr1) {
            print("*")
            ctr2--
        }
        println()
        ctr1++
    }
}