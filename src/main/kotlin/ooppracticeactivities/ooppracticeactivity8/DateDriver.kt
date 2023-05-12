package ooppracticeactivities.ooppracticeactivity8

fun main() {
    println("First Constructor")
    val date1 = Date()
    println(date1.day)
    println(date1.month)
    println(date1.year)

    println("Second Constructor")
    val date2 = Date(25, "February", 2015)
    println(date2.day)
    println(date2.month)
    println(date2.year)
}