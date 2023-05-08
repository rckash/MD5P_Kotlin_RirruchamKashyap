class Person1B(var name: String, var age: Int){
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
    val pedroObject = Person1B("John",21)
    println(pedroObject.name)
    println(pedroObject.age)

    pedroObject.sayHello()
}