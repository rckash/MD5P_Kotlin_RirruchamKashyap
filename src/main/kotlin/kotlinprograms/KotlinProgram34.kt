package kotlinprograms

fun main() {
    println("Enter Number 1:")
    var num1 = readln().toInt()

    println("Enter Number 2:")
    var num2 = readln().toInt()

    var sum = add(num1,num2)
    println("The sum of $num1 and $num2 is $sum")
}

fun add(number1: Int, number2: Int): Int {
    var sum = number1 + number2
    return sum
}