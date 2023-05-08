import kotlinprograms.add

fun main() {
    var tableHead = mutableListOf<String>("CATEGORY","LANGUAGE","LAST BORROWED", "COPIES AVAILABLE")
    var cinderella = mutableListOf("Fairy Tale","English","01-02-23",4)
    var cookingForDummies = mutableListOf("Instructional","English","03-02-23",2)
    var almanac2023 = mutableListOf("Almanac","English","04-07-23",5)
    var samaKutra = mutableListOf("Instructional","Hindi","01-12-23",1)

    //input
    print("Enter Book Title to check: ")
    var bookTitle = readln().uppercase()

    //process + output
    var checkBook = { checkBook: String ->
        println(tableHead)
        if (checkBook == "CINDERELLA") {
            println(cinderella)
        } else if (checkBook == "COOKINGFORDUMMIES") {
            println(cookingForDummies)
        } else if (checkBook == "ALMANAC2023") {
            println(almanac2023)
        } else if (checkBook == "SAMAKUTRA") {
            println(samaKutra)
        } else {
            println("Book does not exist in system")
        }
    }

    checkBook(bookTitle)
    
}