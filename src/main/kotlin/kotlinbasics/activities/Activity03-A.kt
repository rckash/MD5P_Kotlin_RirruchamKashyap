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
                print("Enter Name of Student: ")
                input = readln().uppercase()
                isStudentInRecord(input, studentTable)
            }
            2 -> {
                print("Enter Name of Student to add: ")
                input = readln()
                addStudent(input, studentTable)
                println("Record Updated! Current Record: ")
                println(studentTable)
            }
            3 -> {
                print("Enter Name of Student to remove: ")
                input = readln()
                removeStudent(input, studentTable)
                println("Record Updated! Current Record: ")
                println(studentTable)
            }
            4 -> {
                println(countStudent(input, studentTable))
            }
            5 -> {
                print("Enter Name of Student to Wild Search: ")
                input = readln().uppercase()
                println("Students with \"$input\" in name: ")
                println(searchStudentWildSearch(input, studentTable))
            }
            6 -> {
                print("Enter Name of Student to Search: ")
                input = readln()
                println("Search result: ")
                println(searchStudentName(input, studentTable))
            }
            7 -> {
                println("Enter Name of Student to Wild Search / Exact Search: ")
                input = readln().uppercase()
                println("Search result: ")

                if (input.length < 4) {
                    println(searchStudentWildSearch(input, studentTable))
                } else {
                    println(searchStudentName(input, studentTable))
                }
            }
            8 -> {
                var showStudents = { studentTable: ArrayList<String> ->
                    println(studentTable)
                    studentTable
                }
                println("Displaying Students in Record: ")
                showStudents(studentTable)
            }
            9 -> {
                println("Exiting Program...")
                break
            }
            else -> {
                println("Error: Invalid Selection! Choose from 1-9.\n")
            }
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
    studentTable.size
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




