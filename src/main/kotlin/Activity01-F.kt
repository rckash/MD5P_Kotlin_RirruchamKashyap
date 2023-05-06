fun main() {
    //input
    print("Enter String #1: ")
    var input1 = readln()
    print("Enter String #2: ")
    var input2 = readln()

    //process
    var set1 = input1.toSet()
    var set2 = input2.toSet()
    var uniqueSet = set1.union(set2)

    //output
    print("Unique: ")
    for (char in uniqueSet) {
        print(char)
    }
}