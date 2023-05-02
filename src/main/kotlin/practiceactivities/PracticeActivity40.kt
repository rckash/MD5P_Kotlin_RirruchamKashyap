package practiceactivities

//Write a function called removeDuplicates() that takes in a string and returns a string with all consecutive duplicate characters removed.
//Sample Input/Output
//Enter a string: balloon
//String with duplicates removed: balon


fun main() {
    //input
    print("Enter string: ")
    var string = readln()

    //return value storage
    var noDuplicates = removeDuplicates(string)

    //output
    println("String with duplicates removed: $noDuplicates")
}

fun removeDuplicates(string: String): String {
    var postString = string.uppercase()
    var noDuplicatesTemp = ""
    var noDuplicates = ""
    var stringIndexSize = string.length - 1

    for (i in 0.. stringIndexSize) {
        if (noDuplicatesTemp.contains(postString[i])) {

        } else {
            noDuplicatesTemp += string[i].uppercase()
            noDuplicates += string[i]
        }
    }

    return noDuplicates
}