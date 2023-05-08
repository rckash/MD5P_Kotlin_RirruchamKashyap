package kotlinbasics.activities

fun main() {
    //variables declaration
    var senatorsPH = arrayOf("Cynthia Villar, Raffy Tulfo, Nancy Binay, Loren Legarda, Koko Pimentel, Bong Revilla")
    var groceryList = arrayListOf<String>("Wine, Rice, Spices, Chicken Breast, Spoons, Oats")
    var primaryColors = setOf<String>("Red, Green, Blue")
    var secondaryColors = setOf<String>("Yellow, Cyan, Magenta")
    var employeesIDNum = mapOf<Int, String>(112 to "Leonardo", 121 to "Raphael", 238 to "Donatello", 655 to "Michael Angelo")

    //output
    println("The senators of the Philippines are: ")
    for (i in 0..senatorsPH.size - 1){
        println(senatorsPH[i])
    }

    println("\nGrocery Shopping List: $groceryList")

    println("\nThe Primary Colors are $primaryColors")
    println("The Secondary Colors are $secondaryColors")

    println("\nEmployee with ID Number 121 is ${employeesIDNum.getValue(121)}")
    println("\nEmployee with ID Number 655 is ${employeesIDNum.getValue(655)}")
}