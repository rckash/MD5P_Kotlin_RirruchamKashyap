import java.awt.image.ByteLookupTable
import java.util.PrimitiveIterator

fun main() {
    while (true) {
        try {
            //arraylist declaration
            var bookArray = arrayListOf<String>(
                "Snow White", "Cinderella", "Anatomy 101", "Bible", "Quran",
                "Math 69", "William Shakesphere", "Mary Poppins", "Spiderman", "The Batman",
                "Almanac 2020", "World Literature", "Noli Filibusterismo", "This Book Hates You", "Peppa Porridge",
                "How To Seduce Your Pet", "Monkey King", "Hanumman", "Honorio Lopez", "The World Map"
            )
            //menu
            println("Select Task to be Performed:")
            println("[1] Check if Book is in Record")
            println("[2] Add Book in Record")
            println("[3] Remove Book in Record")
            println("[4] Count Books in Record")
            println("[5] Wild Search for Book in Record")
            println("[6] Search for Book in Record")
            println("[7] Show Books in Record")
            println("[8] Exit")

            //menu selection input
            print("\nSelection: ")
            var menuSelection = readln().toInt()

            //process
            var input: String = ""
            when (menuSelection) {
                1 -> {
                    print("Enter Name of Book: ")
                    input = readln().uppercase()
                    println(isBookInRecord(input, bookArray))
                }
                2 -> {
                    print("Enter Name of Book to add: ")
                    input = readln()
                    addBook(input, bookArray)
                    println("Record Updated! Current Record: ")
                    println(bookArray)
                }
                3 -> {
                    print("Enter Name of Book to remove: ")
                    input = readln()
                    removeBook(input, bookArray)
                    println("Record Updated! Current Record: ")
                    println(bookArray)
                }
                4 -> {
                    countBooks(input, bookArray)
                }
                5 -> {
                    print("Enter Name of Book to Wild Search: ")
                    input = readln().uppercase()
                    println("Books with \"$input\" in name: ")
                    println(searchBookWildSearch(input, bookArray))
                }
                6 -> {
                    print("Enter Name of Book to Search: ")
                    input = readln().uppercase()
                    println("Search result: ")
                    println(searchBookName(input, bookArray))
                }
                7 -> {
                    var showBooks = { bookArray: ArrayList<String> ->
                        println(bookArray)
                        bookArray
                    }
                    println("Displaying Books in Record: ")
                    showBooks(bookArray)
                }
                8 -> {
                    println("Exiting Program...")
                    break
                }
                else -> {
                    println("Error: Invalid Selection! Choose from 1-8.\n")
                }
            }
            println("\nInput \"E\" to End Program or Any Other Key to Restart Program: ")
            var restart = readln().first()
            if ((restart == 'E') || (restart == 'e')) {
                break
            }
            println()
        } catch (exception: NumberFormatException) {
            println("Error: Invalid Input! Choose from 1-8.\n")
        }
    }
}

fun isBookInRecord (input: String, bookArray: ArrayList<String>): Boolean {
    var isInRecord = false
    var indexSize = bookArray.size - 1
    for (i in 0..indexSize){
        if (bookArray[i].uppercase().contains(input)){
            isInRecord = true
        }
    }
    return isInRecord
}

fun addBook(input: String, bookArray: ArrayList<String>) {
    bookArray.add(input)
}

fun removeBook(input: String, bookArray: ArrayList<String>) {
    bookArray.remove(input)
}

fun countBooks(input: String, bookArray: ArrayList<String>) {
    println(bookArray.size)
}

fun searchBookWildSearch(input: String, bookArray: ArrayList<String>): String {
    var toPrint = ""
    var indexSize = bookArray.size - 1
    for (i in 0.. indexSize) {
        if (bookArray[i].uppercase().contains(input)) {
            toPrint += "${bookArray[i]}, "
        }
    }
    return toPrint.dropLast(2)
}

fun searchBookName(input: String, bookArray: ArrayList<String>): String {
    var toPrint = ""
    var indexSize = bookArray.size - 1
    for (i in 0.. indexSize) {
        if (bookArray[i].uppercase().contains(input)) {
            toPrint += "${bookArray[i]}, "
        }
    }
    return toPrint.dropLast(2)
}




