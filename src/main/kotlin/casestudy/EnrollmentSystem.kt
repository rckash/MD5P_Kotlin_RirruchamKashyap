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

    var myStudent = Student()
    myStudent.enrollStudent(studentArray, courseArray)
    myStudent.withdrawStudent(studentArray, courseArray)





}

