package ooppracticeactivities.ooppracticeactivity7

fun main() {
    println("First Constructor")
    val person1 = Person("RC Kashyap")
    println(person1.name)
    println(person1.age)

    println("Second Constructor")
    val person2 = Person("Rich Kashyap", 24)
    println(person2.name)
    println(person2.age)
}