package kotlinoop.kotlinoop7

class Outer {
    //Nested class
    //In a nested class, the Inner class cannot access the properties and behaviors of the outer class

    val outerClassName = "Outer Name"

    class Inner {
        fun callOuter() {
            println("Not possible")
        }
    }
}