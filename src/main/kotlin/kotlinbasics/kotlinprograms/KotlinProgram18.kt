package kotlinbasics.kotlinprograms

fun main() {
    // for loop
    for (counter in 5..10) {
        if (counter == 7) {
            continue    // skips iteration 7
        }
        println(counter)
    }
    println("Hello World!")
}