package ooppracticeactivities.ooppracticeactivity14

fun main() {
    val myEmployee = Employee("Jackie Chun", 55, "Administrator")
    val myTeacher = Teacher("Eusevio Hanma", 60, "Teacher", "English")
    val myAdministrator = Administrator("Junabel Macatangay", 32, "Administrator","College of Arts and Sciences")

    myEmployee.displayInfo()
    println()
    myTeacher.displayInfo()
    println()
    myAdministrator.displayInfo()
}