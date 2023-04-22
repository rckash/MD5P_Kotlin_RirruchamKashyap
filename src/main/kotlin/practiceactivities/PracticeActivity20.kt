fun main() {
    // a program that prints the multiplication table of a given number from 1 to 10.
    // input
    var answer = 'Y'
    while ((answer == 'Y') || (answer == 'y')){
        var num : Int = 0
        println("Enter a positive number: ")
        num = readln().toInt()

        // process
        var ctr1 : Int = 1
        var product : Int = 0
        while (ctr1 <= 10) {
            product = num * ctr1
            println("$num * $ctr1 = $product")
            ctr1++
        }
        println("Restart Code [Y/N]?")
        answer = readln().first()
        println("...")
    }

}