package kotlinbasics.kotlinprograms

fun main() {
    // increment ++ and decrement -- operators
    var x : Int = 1
    println(x++) // post-increment // displays 1
    println(x)
    println(++x) // pre-increment
    println(x)

    var y : Int = 5
    println(--y) // displays 4
    println(y--) // displays 4
    println(y) // displays 3

    var z : Int = 1
    z-=5
    println(z)
}