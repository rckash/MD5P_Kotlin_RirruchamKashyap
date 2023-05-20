package ooppracticeactivities.ooppracticeactivity15


class PartTimeEmployee(private val hourlyWage: Double, private val hoursWorked: Double): Employee() {
    override fun calculateEarnings(): Double {
        return hourlyWage * hoursWorked
    }
}