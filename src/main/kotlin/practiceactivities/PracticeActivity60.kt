package practiceactivities

fun main(){
    //list declaration
    var myList = mutableListOf<Int>(5, 10, 15, 20, 25, 30)

    //print list function
    var displayList = { myList: MutableList<Int> -> println(displayList(myList)) }

    myHOFunction { displayList(myList) }
}

fun myHOFunction(myFunction: () -> Unit){
    myFunction()
}

fun displayList(displayList: MutableList<Int>): MutableList<String>{
    var stringList = mutableListOf<String>()
    displayList.forEach {
        stringList.add("Number: $it")
    }
    return stringList
}