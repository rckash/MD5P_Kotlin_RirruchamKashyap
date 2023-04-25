package practiceactivities

fun main() {
    // data set
    var salesMap = mutableMapOf<String, Float>()
    var topDisplay = 5
    // map data input
    var athleteName = ""
    var athleteSales = 0f
    for (i in 1..topDisplay) {
        print("Enter Athlete $i: ")
        athleteName = readln()
        print("Enter Sales: ")
        athleteSales = readln().toFloat()
        salesMap.put(athleteName, athleteSales)
        println()
    }
    // output
    println("Top 5 Athlete Sales")
    println("Name\tSales")
    println("*******************")
    var totalSales = 0f

//    salesMap.forEach { (athleteName, athleteSales) ->
//        print("$athleteName\t${String.format("%.2f",athleteSales)}")
//        println()
//        totalSales += athleteSales
//    }

    for ((id, element) in salesMap) {
        println("$id\t${String.format("%.2f", element)}")
        totalSales += athleteSales
    }

    println("Total\t${String.format("%.2f",totalSales)}")
}