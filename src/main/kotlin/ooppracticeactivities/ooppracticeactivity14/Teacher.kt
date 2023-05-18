package ooppracticeactivities.ooppracticeactivity14

class Teacher(name: String, age: Int, role: String, val subject: String) : Employee(name, age, role) {
    override fun displayInfo() {
        super.displayInfo()
        println("Subject: $subject")
    }
}