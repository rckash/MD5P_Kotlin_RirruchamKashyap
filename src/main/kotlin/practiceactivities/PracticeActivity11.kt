package practiceactivities
fun main() {
    // variables
    var studentName : String = ""
    var englishGrade : Float = 0f
    var scienceGrade : Float = 0f
    var mathGrade : Float = 0f
    var averageGrade : Float = 0f
    var gradeStatus : String = ""

    // input
    println("Enter name: ")
    studentName = readln()
    println("Enter grade in English: ")
    englishGrade = readln().toFloat()
    println("Enter grade in Science: ")
    scienceGrade = readln().toFloat()
    println("Enter grade in Math: ")
    mathGrade = readln().toFloat()

    // process
    // average computation
    averageGrade = (englishGrade + scienceGrade + mathGrade) / 3
    // grade status conversion
    if ((averageGrade > 100) || (averageGrade < 0)) {
        gradeStatus = "Invalid Grade"
    }
    else {
        if (averageGrade >= 95) {
            gradeStatus = "President Lister"
        } else if (averageGrade >= 89) {
            gradeStatus = "Dean Lister"
        } else if (averageGrade >= 83) {
            gradeStatus = "Average Student"
        } else if (averageGrade >= 78) {
            gradeStatus = "Fair"
        } else {
            gradeStatus = "Failure"
        }
    }

    // output
    println("$studentName's grade average is ${String.format("%.2f",averageGrade)}")
    println("Grade Status is $gradeStatus")
}