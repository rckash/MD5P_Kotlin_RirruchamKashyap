package kotlinbasics.kotlinprograms

fun main() {
    var setA = setOf(1, 2, 3, 4, 5)
    var setB = setOf(4, 5, 6, 7, 8)

    // union
    var unionSet = setA.union(setB)
    println("union - $unionSet")

    // intersection
    var intersectSet = setA.intersect(setB)
    println("intersection - $intersectSet")

    // difference
    var diffSet = setA.subtract(setB)
    println("difference of Set A from Set B is $diffSet")

    var diffSet2 = setA.subtract(setB)
    println("difference of Set A from Set B is $diffSet2")

    // symmetric difference
    println("symmetric difference is ${diffSet.union(diffSet2)}")
}