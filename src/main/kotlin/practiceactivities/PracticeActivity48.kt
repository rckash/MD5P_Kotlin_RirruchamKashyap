import javax.print.attribute.standard.MediaSize.Other

fun main() {
    //input
    print("Enter String: ")
    var string = readln()
    println("Enter a character: ")
    var charToCount = readln().first()

    //return value storage
    var charCount = countOccurence(string, charToCount)

    //output
    println("Character count: " add charCount.toString())
}

infix fun String.add(otherString: String): String {
    return this + otherString
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