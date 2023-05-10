package practiceactivities

//Write a function called countWords() that takes in a string of text and returns the number of words in the text. A word is defined as any sequence of characters separated by whitespace.
//
//Sample Input/Output
//Enter a string: The quick brown fox jumps over the lazy dog.
//Number of words: 9

fun main() {
    //input
    print("Enter a string: ")
    var myString = readln()

    //return value storage
    var wordsCount = countWords(myString)

    //output
    println("Number of Words: $wordsCount")
}

fun countWords(myString: String): Int {
    var wordsCount = 0
    var myStringIndexSize = myString.length - 1

    if (myString != "") {
        wordsCount = 1
        for (i in 0..myStringIndexSize) {
            if ((myString[i] == ' ') && (myString[i - 1] != ' ')) {
                wordsCount += 1
            }
        }
    }

    return wordsCount
}

