fun main() {
    // variable
    var examScore : Int = 0

    // input
    println("Enter Exam Score: ")
    examScore = readln().toInt()

    // process + output
    println("Your Exam Score is $examScore")
    if (examScore >= 90) {
        println("You are graded A")
    }else if (examScore >= 80) {
        println("You are graded B")
    }else if (examScore >= 70) {
        println("You are graded C")
    }
    else if (examScore >= 60) {
        println("You are graded D")
    }
    else {
        println("You are graded F")
    }
}