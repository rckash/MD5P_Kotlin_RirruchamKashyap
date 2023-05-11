package kotlinoop.kotlinoop6

class Outer {
    val outerClassName = "Outer Name"

    inner class Inner {
        fun callOuter() {
            println(outerClassName)
        }
    }
}