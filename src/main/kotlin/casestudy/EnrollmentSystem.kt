package casestudy

fun main() {
    var studentArray = arrayListOf(
        Student(111000,"Billy Dimaunahan",12,'M',9171113335,"billydimaunahan@zmail.com", arrayListOf()),
        Student(111001,"Jane Dimaculangan",13,'F',9171113555,"jdimaculangan@zmail.com",arrayListOf()),
        Student(111002,"Arianne Bingo",12,'F',9171113777,"ariannemingsu@zmail.com",arrayListOf())
    )
    var courseArray = arrayListOf(
        Course(25300, "God-Tier Kotlin", "Paulo Gigachad",60,arrayListOf()),
        Course(25301, "Biology", "Nancy Hinay",40,arrayListOf()),
        Course(25302, "World Literature", "Andrew Kate",80,arrayListOf())
    )

    //class instantiation
    var myStudent = Student()
    var myCourse = Course()

    while (true) {
        //menu
        println("STUDENT ENROLLMENT SYSTEM")
        println("powered by: Kashyap Systems")
        println("****************************************")
        println("STUDENT FUNCTIONS")
        println("[1] Enroll Student in Course")
        println("[2] Withdraw Student from Course")
        println("[3] Generate Student Report")
        println("COURSE FUNCTIONS")
        println("[4] Add Student in Course")
        println("[5] Remove Student in Course")
        println("[6] Generate Course Report")
        println("[7] Exit\n")

        //Menu Input and Process
        print("Enter Function Code (1-7): ")
        var menuInput = readln().toInt()
        println()

        when (menuInput) {
            1 -> {
                myStudent.enrollStudent(studentArray, courseArray)
            }

            2 -> {
                myStudent.withdrawStudent(studentArray, courseArray)
            }

            3 -> {
                myStudent.generateStudentReport(studentArray, courseArray)
            }

            4 -> {
                myCourse.enrollStudent(studentArray, courseArray)
            }

            5 -> {
                myCourse.withdrawStudent(studentArray, courseArray)
            }

            6 -> {
                myCourse.generateCourseReport(studentArray, courseArray)
            }

            7 -> {
                break
            }
        }

    }
}

