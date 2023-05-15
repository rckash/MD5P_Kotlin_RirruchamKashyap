package kotlinoop.activities.activity04a

fun main() {

    var studentSet = arrayListOf(
        Student("Kashyap","RC","RC",15,2022),
        Student("Kashyap", "Rirrucham", "RC", 1114, 2020),
        Student("Bernardo", "Kathryn", "Kath", 1115, 2019),
        Student("Padilla", "Daniel", "DJ", 1116, 2019),
        Student("Padilla", "Robin", "Robby", 1221, 2015),
        Student("Kashyap", "Richard", "Rich", 1117, 2015),
        Student("Tanjiro", "Kamado", "Tanji", 1119, 2019),
        Student("Zenitsu", "Agatsuma", "Zenit", 1120, 2021),
        Student("Naruto", "Uzumaki", "Naru", 1127, 2015),
        Student("Sasuke", "Uchiha", "Sasu", 1137, 2020),
        Student("Itachi", "Uchiha", "Ita", 1157, 2025),
        Student("Dai", "Might", "Dai", 1147, 2017),
        Student("Gai", "Might", "Gai", 1177, 2018),
        Student("Sugatsu", "Kathryn", "Kath", 1187, 2018),
        Student("Inosuke", "Hashibira", "Suke", 1118, 2017)
    )

    wildSearch(studentSet)
}

