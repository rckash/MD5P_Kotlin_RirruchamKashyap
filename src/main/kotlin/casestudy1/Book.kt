package casestudy1

open class Book(private var title: String, private var author: String, private var price: Double, private var quantityInStock: Int) {
    fun setTitle(title: String) {
        this.title = title
    }
    fun getTitle(): String {
        return title
    }
    fun setAuthor(author: String) {
        this.author = author
    }
    fun getAuthor(): String {
        return author
    }
    fun setPrice(price: Double) {
        this.price = price
    }
    fun getPrice(): Double {
        return price
    }
    fun setQuantity(quantityInStock: Int) {
        this.quantityInStock = quantityInStock
    }
    fun getQuantity(): Int {
        return quantityInStock
    }
}