import javax.print.attribute.standard.MediaSize.Other

fun main() {
    //input
    print("Enter String: ")
    var string = readln()
    println("Enter a character: ")
    var charToCount = readln().first()

    //return value storage
    val charCount = (string countOccurence charToCount)

    //output
    println("Character count: $charCount")
}

infix fun String.countOccurence (thisChar: Char): Int {
    var postString = this.uppercase()
    var postChar = thisChar.uppercaseChar()
    var charCount = 0

    for (i in postString) {
        if (postChar == i){
            charCount++
        }
    }

    return charCount
}