package kotlinbasics.kotlinprograms

fun main() {
    // do-while loop
    // 1 : loop variable
    var counter : Int = 0
    do {
        println("Claire")
        if (counter == 3) {
            break // to stop code immediately even without satisfying enclosing loop condition
        }
        // body

        // 3 : update
        counter++
    } while (counter < 5) // 2 : condition

    println("Hello World!")
}