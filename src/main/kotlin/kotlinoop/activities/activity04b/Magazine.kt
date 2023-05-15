package kotlinoop.activities.activity04b

import kotlinoop.activities.activity04a.Student

data class Magazine(
    var editor: String,
    var title: String,
    var monthPublished: String,
    var yearPublished: Int,
    var article: Int
)

fun titleWildSearch(magazineArray: ArrayList<Magazine>, newspaperArray: ArrayList<Newspaper>, comicsArray: ArrayList<Comics>) {
    //input
    print("Enter Title to search for: ")
    var input = readln().uppercase()

    //wild search
    println("Wild Search Result/s: ")
    println("Magazine/s: ")
    for (i in 0..magazineArray.lastIndex) {
        var (editor, title, monthPub, yearPub, article) = magazineArray[i]
        if (title.uppercase().contains(input)) {
            println(magazineArray[i].toString())
        }
    }
    println("Newspaper/s: ")
    for (i in 0..newspaperArray.lastIndex) {
        var (name, dayPub, monthPub, yearPub, headline, article) = newspaperArray[i]
        if (name.uppercase().contains(input)) {
            println(newspaperArray[i].toString())
        }
    }
    println("Comic/s: ")
    for (i in 0..comicsArray.lastIndex) {
        var (title, monthPub, yearPub, illustrator, publisher) = comicsArray[i]
        if (title.uppercase().contains(input)) {
            println(comicsArray[i].toString())
        }
    }
    println()
}

fun authorWildSearch(magazineArray: ArrayList<Magazine>, newspaperArray: ArrayList<Newspaper>, comicsArray: ArrayList<Comics>, booksArray: ArrayList<Book>) {
    //input
    print("Enter Author to search for: ")
    var input = readln().uppercase()

    //wild search
    println("Wild Search Result/s: ")
    println("Magazine/s: ")
    for (i in 0..magazineArray.lastIndex) {
        var (editor, title, monthPub, yearPub, article) = magazineArray[i]
        if (editor.uppercase().contains(input)) {
            println(magazineArray[i].toString())
        }
    }
    println("Newspaper/s: ")
    for (i in 0..newspaperArray.lastIndex) {
        var (name, dayPub, monthPub, yearPub, headline, article) = newspaperArray[i]
        if (name.uppercase().contains(input)) {
            println(newspaperArray[i].toString())
        }
    }
    println("Comic/s: ")
    for (i in 0..comicsArray.lastIndex) {
        var (title, monthPub, yearPub, illustrator, publisher) = comicsArray[i]
        if (illustrator.uppercase().contains(input)) {
            println(comicsArray[i].toString())
        }
    }
    println("Book/s: ")
    for (i in 0..booksArray.lastIndex) {
        var (title, author, yearPub, edition, ISBN, publisher, chapList, numPages) = booksArray[i]
        if (author.uppercase().contains(input)) {
            println(booksArray[i].toString())
        }
    }
    println()
}