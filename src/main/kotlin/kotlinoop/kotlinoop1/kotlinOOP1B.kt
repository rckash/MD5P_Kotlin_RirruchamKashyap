package kotlinoop.kotlinoop1//objects - represents something in the real world
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

class Person1C(name: String, age: Int){
    //attributes
    var name: String
    var age: Int

    //init block, initialization
    init {
        this.name = "Pedro"
        this.age = 21
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
    val pedroObject = Person1C("John",21)
    println(pedroObject.name)
    println(pedroObject.age)

    pedroObject.sayHello()
}