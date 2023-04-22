fun main() {
    // arrayList
    var names = ArrayList<String>()
    println("Enter Name 1: ")
    names.add(readln())
    println("Enter Name 2: ")
    names.add(readln())
    println("Enter Name 3: ")
    names.add(readln())

    var ctr : Int = 0
    while (ctr < names.size) {
        println(names[ctr])
        ctr++
    }
}