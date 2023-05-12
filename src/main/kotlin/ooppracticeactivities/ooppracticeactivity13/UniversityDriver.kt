package ooppracticeactivities.ooppracticeactivity13

fun main() {
    println("Outer Class")
    val uni1 = University()
    println(uni1.name)


    println("Inner Class")
    val stud1 = uni1.Student()
    println(stud1.name)
    println(stud1.id)
}