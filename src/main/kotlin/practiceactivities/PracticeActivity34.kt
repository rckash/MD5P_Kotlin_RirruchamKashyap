package kotlinbasics.practiceactivities

fun main() {
    var answer = 'Y'
    while ((answer == 'Y') || (answer == 'y')) {

        // input
        println("Enter String: ")
        var myText = readln()

        var stringLength = myText.length
        var stringSize = stringLength - 1
        var vowelCtr = 0

        for (i in 0..stringSize) {
            if (myText[i] == 'a') {
                vowelCtr += 1
            }
            else if (myText[i] == 'e') {
                vowelCtr += 1
            }
            else if (myText[i] == 'i') {
                vowelCtr += 1
            }
            else if (myText[i] == 'o') {
                vowelCtr += 1
            }
            else if (myText[i] == 'u') {
                vowelCtr += 1
            }
        }

        println("Number of vowels in String: $myText is $vowelCtr")
        println()
        println("Restart Program? (Y/N) ")
        answer = readln().first()
        println("\n****************************\n")
    }
}