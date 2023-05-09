//objects - represents something in the real world
//class - blueprint of an object
//Structural Programming, Procedural Programming
//top to bottom

//Person Class
///////attributes/properties
//name
//age
//////behaviors
//walk
//eat

class Person{
    //attributes
    var name: String
    var age: Int

    //init block, initialization
    init {
        name = "Pedro"
        age = 21
    }

    fun walk() {
        println("A person walks")
    }
    fun eat() {
        println("A person eats")
    }
    fun sayHello() {
        println("$name says Hello!")
    }
}
fun main() {
    //instantiation - creating objects from a class
    val pedroObject = Person()
    println(pedroObject.name)

    pedroObject.sayHello()
}