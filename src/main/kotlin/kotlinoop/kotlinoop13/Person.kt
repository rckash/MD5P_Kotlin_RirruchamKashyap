package kotlinoop.kotlinoop13

class Person: Singer, Dancer {
    private var name: String

    init {
        name = "Default Name"
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getName(): String {
        return name
    }

    override fun sing() {
        println("A persons sings...")
    }

    override fun dance() {
        println("A dancer dances...")
    }
}