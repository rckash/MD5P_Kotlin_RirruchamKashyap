package practiceactivities

fun main() {
    // sets data
    var setA = mutableSetOf<Int>()
    var setB = mutableSetOf<Int>()
    var numIt = 0

    // input for number of integers to be accepted
    println("Enter number of integers in setA and setB each: ")
    numIt = readln().toInt()

    // loop for setA data input
    println("Set A:")
    for (i in 1..numIt) {
        println("Enter number $i")
        setA.add(readln().toInt())
    }

    // loop for setB data input
    println("Set B:")
    for (j in 1..numIt) {
        println("Enter number $j")
        setB.add(readln().toInt())
    }

    // get intersection process
    var intersectSet = setA.intersect(setB)

    println("Intersection of the sets: $intersectSet")
}