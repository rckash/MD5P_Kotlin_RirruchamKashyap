package casestudy

data class Student(
    var studentID: Int = 0,
    var name: String = "",
    var age: Int = 0,
    var gender: Char = 'M',
    var contactNumber: Long = 0,
    var contactEMailAddress: String = "",
    var enrolledCourses: ArrayList<String> = arrayListOf()
) {
    fun enrollStudent(studentArray: ArrayList<Student>, courseArray: ArrayList<Course>) {
        //input
        print("Enter Name of Student to Enroll: ")
        var enrollmentNameInput = readln().uppercase()

        //output for Student wild search
        var studentToEnroll = ""
        for (i in 0..studentArray.lastIndex) {
            if (studentArray[i].name.uppercase().contains(enrollmentNameInput)) {
                print("${studentArray[i].studentID}, ${studentArray[i].name}, ${studentArray[i].age}, ${studentArray[i].gender}, ${studentArray[i].enrolledCourses}\n")
                studentToEnroll = studentArray[i].name
            }
        }

        print("Enter Course to Enroll in: ")
        var enrollmentCourseInput = readln().uppercase()

        var courseToEnrollIn = ""
        //output for course wild search
        for (i in 0..courseArray.lastIndex) {
            if (courseArray[i].courseName.uppercase().contains(enrollmentCourseInput)) {
                print("${courseArray[i].courseID}, ${courseArray[i].courseName}, ${courseArray[i].instructorName}, ${courseArray[i].maxNumOfStudents}\n")
                courseToEnrollIn = courseArray[i].courseName
            }
        }
        //output for course wild search
        for (i in 0..studentArray.lastIndex) {
            if (studentArray[i].name.uppercase().contains(enrollmentNameInput)) {
                studentArray[i].enrolledCourses.add(courseToEnrollIn)
            }
        }
        //output for course update
        for (i in 0..courseArray.lastIndex) {
            if (courseArray[i].courseName.uppercase().contains(enrollmentCourseInput)) {
                courseArray[i].enrolledStudents.add(studentToEnroll)
            }
        }
        println()
    }

    fun withdrawStudent(studentArray: ArrayList<Student>, courseArray: ArrayList<Course>) {
        //input
        print("Enter Name of Student to Withdraw: ")
        var withdrawalNameInput = readln().uppercase()

        //output for student wild search
        var studentToWithdraw = ""
        for (i in 0..studentArray.lastIndex) {
            if (studentArray[i].name.uppercase().contains(withdrawalNameInput)) {
                print("${studentArray[i].studentID}, ${studentArray[i].name}, ${studentArray[i].age}, ${studentArray[i].gender}, ${studentArray[i].enrolledCourses}\n")
                studentToWithdraw = studentArray[i].name
            }
        }

        print("Enter Course to Withdraw in: ")
        var withdrawalCourseInput = readln().uppercase()

        //output for student wild search
        var courseToWithdrawFrom = ""
        for (i in 0..courseArray.lastIndex) {
            if (courseArray[i].courseName.uppercase().contains(withdrawalCourseInput)) {
                print("${courseArray[i].courseID}, ${courseArray[i].courseName}, ${courseArray[i].instructorName}, ${courseArray[i].maxNumOfStudents}\n")
                courseToWithdrawFrom = studentArray[i].name
            }
        }
        //output for course wild search
        for (i in 0..studentArray.lastIndex) {
            if (studentArray[i].name.uppercase().contains(withdrawalNameInput)) {
                studentArray[i].enrolledCourses.remove(courseToWithdrawFrom)
            }
        }
        //output for course update
        for (i in 0..courseArray.lastIndex) {
            if (courseArray[i].courseName.uppercase().contains(withdrawalCourseInput)) {
                courseArray[i].enrolledStudents.remove(studentToWithdraw)
                println("Enrolled Students: ${courseArray[i].enrolledStudents}")
            }
        }
        println()
    }

    fun generateStudentReport(studentArray: ArrayList<Student>, courseArray: ArrayList<Course>) {
        print("Enter Student Name to Generate Report for: ")
        var generateStudentCourseInput = readln().uppercase()

        for (i in 0..studentArray.lastIndex) {
            if (studentArray[i].name.uppercase().contains(generateStudentCourseInput)) {
                println("Student Report For: ${studentArray[i].studentID}, ${studentArray[i].name}")
                println("Enrolled Courses: ")
                println(studentArray[i].enrolledCourses)
            }
        }
        println()
    }


}
