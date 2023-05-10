package ooppracticeactivities.ooppracticeactivity5

class Student(var isCollege: Boolean = true) {
    var name: String = ""
    var age: Int = 0
    var grade: Int = 0

    fun promote(grade: Int): Unit{
        var amount = 1
        var newGrade = grade + amount
        println("new grade: ${newGrade}")
    }
}