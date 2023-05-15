package kotlinoop.activities.activity04a

data class Student (
    var firstName: String,
    var lastName: String,
    var nickName: String,
    var id: Int,
    var yearEnrolled: Int
)

fun wildSearch(studentSet: ArrayList<Student>) {
    //input
    print("Enter String to search for: ")
    var input = readln().uppercase()

    //wild search
    println("Wild Search Result/s: ")
    for (i in 0..studentSet.lastIndex) {
        var (firstName, lastName, nickName, id, yearEnrolled) = studentSet[i]
        if (firstName.uppercase().contains(input)) {
            println(studentSet[i])
        } else if (lastName.uppercase().contains(input)) {
            println(studentSet[i])
        } else if (nickName.uppercase().contains(input)) {
            println(studentSet[i])
        }
    }
}

//    Student("Kashyap", "Rirrucham", "RC", 1114, 2020)
//    Student("Bernardo", "Kathryn", "Kath", 1115, 2019),
//    Student("Padilla", "Daniel", "DJ", 1116, 2019),
//    Student("Padilla", "Robin", "Robby", 1221, 2015),
//    Student("Kashyap", "Richard", "Rich", 1117, 2015),
//    Student("Tanjiro", "Kamado", "Tanji", 1119, 2019),
//    Student("Zenitsu", "Agatsuma", "Zenit", 1120, 2021),
//    Student("Naruto", "Uzumaki", "Naru", 1127, 2015),
//    Student("Sasuke", "Uchiha", "Sasu", 1137, 2020),
//    Student("Itachi", "Uchiha", "Ita", 1157, 2025),
//    Student("Dai", "Might", "Dai", 1147, 2017),
//    Student("Gai", "Might", "Gai", 1177, 2018),
//    Student("Sugatsu", "Kathryn", "Kath", 1187, 2018),
//    Student("Inosuke", "Hashibira", "Suke", 1118, 2017)
