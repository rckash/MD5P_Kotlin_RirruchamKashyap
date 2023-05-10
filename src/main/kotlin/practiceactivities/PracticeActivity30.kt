package practiceactivities

fun main() {
    // map data
    var phoneBook = mapOf<String, String>("Alice" to "555-1234", "Bob" to "555-5678", "Charlie" to "555-9101")

    // restart program loop
    var answer = 'Y'
    while ((answer == 'Y')||(answer == 'y')) {
        // input
        var nameQuery = ""
        print("Enter name: ")
        nameQuery = readln()

        // output
        print("$nameQuery's phone number is: ${phoneBook[nameQuery]}\n")

        // Restart Program Input
        print("\nRestart Program (Y/N)? ")
        answer = readln().first()
        println("\n***************\n")
    }
}