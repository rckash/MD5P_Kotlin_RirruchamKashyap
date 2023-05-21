package casestudy1

class NonFictionCategory (private var name: String): Category(name) {
    override fun displayCategory() {
        println("This is the Non-Fiction Category.")
    }
}