import java.awt.image.ByteLookupTable
import java.util.PrimitiveIterator

fun main() {
    while (true) {
    try {
        //arraylist declaration
        var studentTable = arrayListOf<String>(
        "Marco", "Eugene", "Sarah", "Isaiah", "Anthony",
        "Henry", "William", "Mary", "Zelda", "Rica",
        "Ivy", "Mark", "Jake", "John", "Maya",
        "Jean", "Angela", "Maria", "Jun", "CJ"
        )
        //menu
        println("Select Task to be Performed:")
        println("[1] Check if Student is in Record")
        println("[2] Add Student in Record")
        println("[3] Remove Student in Record")
        println("[4] Count Students in Record")
        println("[5] Wild Search for Student in Record")
        println("[6] Search for Student in Record")
        println("[7] Wild Search/Search for Student in Record")
        println("[8] Show Students in Record")
        println("[9] Exit")

        //menu selection input
        print("\nSelection: ")
        var menuSelection = readln().toInt()

        //process
        var input: String = ""
        when (menuSelection) {
            1 -> {
                print("Enter Name of Student: ")        //check student in record function
                input = readln().uppercase()
                println(isStudentInRecord(input, studentTable))
            }
            2 -> {
                print("Enter Name of Student to add: ")         //add student in record function
                input = readln()
                addStudent(input, studentTable)
                println("Record Updated! Current Record: ")
                println(studentTable)
            }
            3 -> {
                print("Enter Name of Student to remove: ")          //remove student in record function
                input = readln()
                removeStudent(input, studentTable)
                println("Record Updated! Current Record: ")
                println(studentTable)
            }
            4 -> {
                countStudent(input, studentTable)           //count students in record function
            }
            5 -> {
                print("Enter Name of Student to Wild Search: ")         //wild search student in record function
                input = readln().uppercase()
                println("Students with \"$input\" in name: ")
                println(searchStudentWildSearch(input, studentTable))
            }
            6 -> {
                print("Enter Name of Student to Search: ")          //exact search student in record function
                input = readln().uppercase()
                println("Search result: ")
                println(searchStudentName(input, studentTable))
            }
            7 -> {
                println("Enter Name of Student to Wild Search / Exact Search: ")        //wild search/exact search student in record function
                input = readln().uppercase()
                println("Search result: ")

                if (input.length < 4) {
                    println(searchStudentWildSearch(input, studentTable))
                } else {
                    println(searchStudentName(input, studentTable))
                }
            }
            8 -> {
                var showStudents = { studentTable: ArrayList<String> ->         //display students in record function
                    println(studentTable)
                    studentTable
                }
                println("Displaying Students in Record: ")
                showStudents(studentTable)
            }
            9 -> {
                println("Exiting Program...")           //exit program function
                break
            }
            else -> {
                println("Error: Invalid Selection! Choose from 1-9.\n")
            }
        }
        println("\nInput \"E\" to End Program or Any Other Key to Restart Program: ")       //restart program function
        var restart = readln().first()
        if ((restart == 'E') || (restart == 'e')) {
            break
        }
        println()
    } catch (exception: NumberFormatException) {
        println("Error: Invalid Input! Choose from 1-9.\n")
    }
}
}

fun isStudentInRecord (input: String, studentTable: ArrayList<String>): Boolean {
    var isInRecord = false
    var indexSize = studentTable.size - 1
    for (i in 0..indexSize){
        if (studentTable[i].uppercase().contains(input)){
            isInRecord = true
        }
    }
    return isInRecord
}

fun addStudent(input: String, studentTable: ArrayList<String>) {
    studentTable.add(input)
}

fun removeStudent(input: String, studentTable: ArrayList<String>) {
    studentTable.remove(input)
}

fun countStudent(input: String, studentTable: ArrayList<String>) {
    println(studentTable.size)
}

fun searchStudentWildSearch(input: String, studentTable: ArrayList<String>): String {
    var toPrint = ""
    var indexSize = studentTable.size - 1
    for (i in 0.. indexSize) {
        if (studentTable[i].uppercase().contains(input)) {
            toPrint += "${studentTable[i]}, "
        }
    }
    return toPrint.dropLast(2)
}

fun searchStudentName(input: String, studentTable: ArrayList<String>): String {
    var toPrint = ""
    var indexSize = studentTable.size - 1
    for (i in 0.. indexSize) {
        if (studentTable[i].uppercase().contains(input)) {
            toPrint += "${studentTable[i]}, "
        }
    }
    return toPrint.dropLast(2)
}




