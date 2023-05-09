package kotlinbasics.practiceactivities

fun main() {
    //input
    println("Enter number of eggs: ")
    var eggs = readln().toInt()

    //storage for returned values
    var lessDozen = showLessDozen(eggs)
    var dozen = determineDozen(eggs)

    //output
    println("Number of dozens: $dozen")
    println("Eggs less than a dozen: $lessDozen")

}
fun showLessDozen(eggs: Int): Int {
    var lessDozen = eggs % 12
    return lessDozen
}

fun determineDozen(eggs: Int): Int {
    var dozen = eggs / 12
    return dozen
}