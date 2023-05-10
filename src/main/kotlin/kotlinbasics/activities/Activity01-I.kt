

fun main() {
    //input
    print("Enter Book Title: ")
    var book = readln()
    print("Enter Borrower's Name: ")
    var borrower = readln()
    print("Enter Return Deadline: ")
    var returnDeadline = readln()

    //data storage
    var borrowSet = mutableSetOf<String>()

    var storeBorrowInfo = { book: String, borrower: String, returnDeadline: String ->       //function for storing borrow data
        borrowSet.add(book)
        borrowSet.add(borrower)
        borrowSet.add(returnDeadline)
    }

    storeBorrowInfo(book,borrower,returnDeadline)

    //output
    println(borrowSet)
}