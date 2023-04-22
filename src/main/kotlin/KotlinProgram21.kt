fun main() {
    // only strings
    var names = arrayOf<String>("paul","john","ringo","george")
    // any data type
    // var names = arrayOf("paul","john","ringo","george")
    println("array size is ${names.size}")

    var ctr : Int = 0
    while (ctr < names.size) {
        println(names[ctr])
        ctr++
    }
}