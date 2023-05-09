package kotlinbasics.practiceactivities

//Write a function called replaceSpaces() that takes in a string and replaces all spaces with underscores.
//Sample Input/Output
//
//Enter a string: Hello world!
//String with spaces replaced: Hello_world!


fun main() {
    //input
    print("Enter String: ")
    var string = readln()

    //return value storage
    var noSpaces = replaceSpaces(string)

    //output
    println("String with spaces replaced: ")
    println(noSpaces)
}

fun replaceSpaces(string: String): String {
    var stringIndexSize = string.length - 1
    var noSpaces = ""

    for (i in 0..stringIndexSize) {
        if (string[i] == ' ') {
            noSpaces += '_'
        } else {
            noSpaces += string[i]
        }
    }

    return noSpaces
}