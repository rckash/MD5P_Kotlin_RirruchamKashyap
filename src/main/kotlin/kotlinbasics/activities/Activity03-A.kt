import java.awt.image.ByteLookupTable
import java.util.PrimitiveIterator

fun main() {
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
    println("[8] Exit")

    //menu selection input
    print("\nSelection: ")
    var menuSelection = readln().toInt()

    //process
    var input: String = ""
    when (menuSelection) {
        1 -> {
            print("Enter Name of Student: ")
            input = readln()
            isStudentInRecord(input, studentTable)
        }

    }
}

fun isStudentInRecord (input: String, studentTable: ArrayList<String>) {
    println(studentTable.contains(input))
}