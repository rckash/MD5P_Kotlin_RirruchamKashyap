package ooppracticeactivities.ooppracticeactivity1

class Person(var isStudent: Boolean = true) {
    var name: String = "RC Kashyap"
    var age: Int = 24
    var email: String = "rckashyap@gmail.com"
    fun printDetails(name: String, age: Int, email: String) {
        println("name: $name")
        println("age: $age")
        println("email: $email")
    }
}