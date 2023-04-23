package practiceactivities

fun main() {
    // input
    var baseSize = 0
    println("Enter Base Size of Dollar Triangle: ")
    baseSize = readln().toInt()

    // outer loop
    var space = baseSize - 1
    for(i in 1 .. baseSize){
        var toPrint = ""
        // inner loop for string formation
        for(i in 1 .. baseSize){
            if(i > space){
                toPrint += "$"
            }else{
                toPrint += " "
            }
        }
        println(toPrint)    // prints string
        space -= 1
    }
}