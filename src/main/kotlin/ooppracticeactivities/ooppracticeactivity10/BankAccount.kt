package ooppracticeactivities.ooppracticeactivity10

class BankAccount {
    var accountNumber: Int
    var balance: Int

    //primary constructor
    constructor(accountNumber: Int) {
        this.accountNumber = accountNumber
        balance = 20
    }

    //secondary constructor
    constructor(accountNumber: Int, balance: Int) {
        this.accountNumber = accountNumber
        this.balance = balance
    }
}