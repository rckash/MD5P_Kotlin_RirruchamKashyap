package ooppracticeactivities.ooppracticeactivity9

fun main() {
    println("Primary Constructor")
    val car1 = Car("Aluminum", "Mustang")
    println(car1.make)
    println(car1.model)
    println(car1.year)

    println("Secondary Constructor")
    val car2 = Car("Wood", "Bugati", 1569)
    println(car2.make)
    println(car2.model)
    println(car2.year)
}