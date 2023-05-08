import kotlinprograms.add

fun main() {
    var tableHead = mutableListOf<String>("Preliminary Grade","Midterm Grade","Semi-final Grade","Final Grade", "Final Project Grade")
    var bob = mutableListOf(75,88,90,"NA")
    var gretel = mutableListOf(85,80,90,79)
    var nick = mutableListOf(75,"NA",80)
    var harriet = mutableListOf(75,78,90)

    //input
    print("Enter Student Name to check grade for: ")
    var studentName = readln()

    //student grade output
    var checkGrade = { studentName: String ->
        println(tableHead)
        if (studentName == "bob") {
            println(bob)
        } else if (studentName == "gretel") {
            println(gretel)
        } else if (studentName == "nick") {
            println(nick)
        } else if (studentName == "harriet") {
            println(harriet)
        } else {
            println("Student does not exist in system")
        }
    }

    checkGrade(studentName)

    //check if user wants to add new data
    println("Add Data?")
    var addDataCheck = readln().first()

    //new student grade output
    if ((addDataCheck == 'y') || (addDataCheck == 'Y')) {
        println("Enter Grade: ")
        var newGrade = readln().toInt()

        if (studentName == "bob") {
            bob.add(newGrade)
            println("Bob New Grade: ")
            println(bob)
        } else if (studentName == "gretel") {
            gretel.add(newGrade)
            println("Gretel New Grade: ")
            println(gretel)
        } else if (studentName == "nick") {
            nick.add(newGrade)
            println("Nick New Grade: ")
            println(nick)
        } else if (studentName == "harriet") {
            harriet.add(newGrade)
            println("Harriet New Grade: ")
            println(harriet)
        }

    }

}