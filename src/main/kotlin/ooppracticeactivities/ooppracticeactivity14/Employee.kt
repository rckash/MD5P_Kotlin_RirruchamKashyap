package ooppracticeactivities.ooppracticeactivity14

open class Employee(private val name: String, private val age: Int, private val role: String) {


    open fun displayInfo() {
        println("Name: $name")
        println("Age: $age")
        println("Role: $role")
    }
}