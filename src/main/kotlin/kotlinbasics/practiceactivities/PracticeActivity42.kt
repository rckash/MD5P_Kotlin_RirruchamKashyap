package kotlinbasics.practiceactivities

//Write a function called countOccurence() that takes in a string and a character, and returns the number of times the character appears in the string.
//Sample Input/Output

//Enter a string: Hello World
//Enter a character: l
//Character count: 3

fun main() {
    //input
    print("Enter String: ")
    var string = readln()
    println("Enter a character: ")
    var charToCount = readln().first()

    //return value storage
    var charCount = countOccurence(string, charToCount)

    //output
    println("Character count: ")
    println(charCount)
}

fun countOccurence(string: String, charToCount: Char): Int {
    var stringIndexSize = string.length - 1
    var postString = string.uppercase()
    var postChar = charToCount.uppercaseChar()
    var charCount = 0

    for (i in 0..stringIndexSize) {
        if (postString[i] == postChar) {
            charCount += 1
        }
    }

    return charCount
}