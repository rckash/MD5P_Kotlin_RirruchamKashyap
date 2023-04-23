package practiceactivities

fun main() {
    var baseSize = 0
    println("Enter Base Size of Dollar Triangle: ")
    baseSize = readln().toInt()

    var space = baseSize - 1
    for(i in 1 .. baseSize){
        var toPrint = ""
        for(i in 1 .. baseSize){
            if(i > space){
                toPrint += "$"
            }else{
                toPrint += " "
            }
        }
        println(toPrint)
        space -= 1
    }
}