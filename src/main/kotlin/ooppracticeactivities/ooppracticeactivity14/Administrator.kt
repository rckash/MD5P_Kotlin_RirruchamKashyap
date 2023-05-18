package ooppracticeactivities.ooppracticeactivity14

class Administrator(name: String, age: Int, role:String = "Administrator", val department: String): Employee(name, age, role) {
    override fun displayInfo() {
        super.displayInfo()
        println("Department: $department")
    }
}