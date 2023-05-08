package kotlinbasics.practiceactivities

//Write a function called computeAverage() that takes in a list of numbers and returns their average. If the list is empty, the function should return 0.
//
//Sample Input/Output
//Enter Number 1: 3.5
//Enter Number 2: 2.0
//Enter Number 3: 6.75
//Enter Number 4: 4.25
//Enter Number 5: 1.5
//Average: 3.8

fun main() {
    // variables list declaration
    var myList = mutableListOf<Double>()
    var listInput: Double = 0.0
    var desiredListIndexSize = 4

    //input
    for (i in 0..desiredListIndexSize) {
        print("Enter Number ${i + 1}: ")
        listInput = readln().toDouble()
        myList.add(listInput)
    }

    //return value storage
    var average = { myList: MutableList<Double> ->
        var ave = myList.average()
        ave.toDouble()
    }

    //output
    println("Average is: ${average(myList)}")

}