package practiceactivities

fun main() {
    // input
    print("Enter String: ")
    var myText = readln()

    // variables declaration
    var stringLength = myText.length
    var stringSize = stringLength - 1
    var revString = ""

    // process
    for (i in 0..stringSize) {
        revString += myText[stringLength - i - 1]
    }
    println("Normal String and Reversed:")
    println(myText)
    println(revString)
}