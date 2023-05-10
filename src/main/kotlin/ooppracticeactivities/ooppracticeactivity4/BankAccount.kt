package ooppracticeactivities.ooppracticeactivity4

class BankAccount(var isMoney : Boolean = true) {
    var accountNumber: Int = 0
    var balance: Double = 0.0

    fun deposit(amount: Int) {
        balance += amount
        println("Deposited Successfully")
        println("Balance is now: $balance")
    }

    fun withdraw(amount: Int) {
        balance -= amount
        println("Withdrawn Successfully")
        println("Balance is now: $balance")
    }
}