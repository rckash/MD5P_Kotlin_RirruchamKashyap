package casestudy1

open class Customer(private var name: String, private var email: String): User(name, email), Discountable {
    override fun applyDiscount() {
        println("Customer: $name gets a 5% discount on book price")
    }

}