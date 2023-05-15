package kotlinoop.activities.activity04b

fun main() {
    var magazineArray = arrayListOf(
        Magazine("Shrek Dimailig","XOSMO Manila","February",2022,22),
        Magazine("Shrek Dimailig","Q-ZONE","December",2017,14),
        Magazine("Fiona Masangkay","Scientology 101","March",2011,133)
    )
    var newspaperArray = arrayListOf(
        Newspaper("Daily Bugle",21,"June",2020,"Spiderman Strikes Again",4),
        Newspaper("Laguna Bulletin",13,"July",2021,"Superman Strikes Again",23),
        Newspaper("The Quillmaker",1,"June",2015,"Filipino Wins Most American Man",15)
    )
    var booksArray = arrayListOf(
        Book("The Book of Love","Venom Lapuz",2022,"III",20255,"Marvell",17,322),
        Book("How to Write a Book","Queenie Evans",2002,"Kids",20555,"VIVABooks",8,102),
        Book("The Ways of a Warrior","Shrek Dimailig",2023,"I",15112,"TANDA",20,255)
    )
    var comicsArray = arrayListOf(
        Comics("Superman Retorns","August",2021,"John Oldman","Marvell"),
        Comics("The Legend of Spiderman","May",2012,"Henry Taulava","BrusComics"),
        Comics("Indianny Sins","September",2012,"Jenny Lopez","PLDC")
    )
    var avArray = arrayListOf(
        AudioVideoRecording(true, true, 20, 2013, "How to Dance", "VIVABooks"),
        AudioVideoRecording(true, false, 30, 2023, "How to Cook", "VIVABooks"),
        AudioVideoRecording(false, true, 76, 2011, "Tales of the Abigail", "Phoenix AV Records")
    )

    println("Title Wild Search")
    titleWildSearch(magazineArray, newspaperArray, comicsArray)
    println("Author Wild Search")
    authorWildSearch(magazineArray, newspaperArray, comicsArray, booksArray)

}