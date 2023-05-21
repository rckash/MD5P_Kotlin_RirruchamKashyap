package casestudy1

open class ShoppingCart(): Book("title", "author", 0.0, 0) {

    private var cartList = mutableListOf<Book>()

    fun addToCart(book: Book) {
        println("Added to cart: ${book.getTitle()}.")
        this.cartList.add(book)
    }

    fun removeFromCart(book: Book) {
        println("removed from cart: ${book.getTitle()}")
        this.cartList.remove(book)
    }

    fun displayCart() {
        println("Shopping Cart:")
        cartList.forEach{
            println(it.getTitle())
            println(it.getAuthor())
            println(it.getPrice())
            println(it.getQuantity())
            println()
        }
    }
}