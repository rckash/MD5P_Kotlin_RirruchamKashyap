package kotlinbasics.activities

fun main() {
    //input
    print("Enter String: ")
    var input1 = readln()

    //process
    var postInput1 = input1.uppercase()
    var maxIndex = input1.lastIndex
    var reversed = ""
    for (i in 0..maxIndex) {
        reversed += input1[maxIndex - i].uppercase()
    }

    var palindrome = false
    if (postInput1 == reversed) {
        palindrome = true
    }

    //output
    if (palindrome == true) {
        println("$input1 is a Palindrome")
    } else {
        println("$input1 is not a Palindrome")
    }
}