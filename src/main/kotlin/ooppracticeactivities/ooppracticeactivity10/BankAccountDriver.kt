package ooppracticeactivities.ooppracticeactivity10

import ooppracticeactivities.ooppracticeactivity9.Car

fun main() {
    println("Primary Constructor")
    val bankAcc1 = BankAccount(323222232)
    println(bankAcc1.accountNumber)
    println(bankAcc1.balance)

    println("Secondary Constructor")
    val bankAcc2 = BankAccount(56454545, 40000)
    println(bankAcc2.accountNumber)
    println(bankAcc2.balance)
}