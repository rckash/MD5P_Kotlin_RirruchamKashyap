package ooppracticeactivities.ooppracticeactivity15

fun main() {
    val myFullTimeEmployee = FullTimeEmployee(150.0, 25.6)
    println("Calculated Earning for Full-Time Employee: ${ myFullTimeEmployee.calculateEarnings() }")

    val myPartTimeEmployee = PartTimeEmployee(50.0,20.0)
    println("Calculated Earning for Part-Time Employee: ${ myPartTimeEmployee.calculateEarnings() }")
}