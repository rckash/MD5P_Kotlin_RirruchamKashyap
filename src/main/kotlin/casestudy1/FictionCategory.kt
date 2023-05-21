package casestudy1

class FictionCategory(private var name: String): Category(name), Discountable {
    override fun displayCategory() {
        println("This is the Fiction Category.")
    }

    override fun applyDiscount() {
    println("10% Discount on Fiction")//apply 10% discount on book price
    }
}