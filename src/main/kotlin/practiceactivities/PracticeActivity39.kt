package practiceactivities

fun main() {
    //input
    println("Enter String: ")
    var string = readln()

    //returned value storage
    var revString = reverseString(string)

    //output
    println("String reversed is:")
    println("$revString")
}

fun reverseString(string: String): String {
    var revString = string.reversed()
    return revString
}