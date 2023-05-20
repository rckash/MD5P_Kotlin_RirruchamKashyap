package ooppracticeactivities.ooppracticeactivity15

class FullTimeEmployee(private val dailySalary: Double, private val daysWorked: Double): Employee() {
    override fun calculateEarnings(): Double {
        return dailySalary * daysWorked
    }
}