package ooppracticeactivities.ooppracticeactivity3

class Book(var isPhysical: Boolean = true) {
    var title: String = ""
    var author: String = ""
    var year: Int = 0

    fun printDetails(title: String, author: String, year: Int) {
        println("title: $title")
        println("author: $author")
        println("year: $year")
    }
}