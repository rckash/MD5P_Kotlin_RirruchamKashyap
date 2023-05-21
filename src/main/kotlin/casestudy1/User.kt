package casestudy1

open class User(private var name: String, private var email: String) {
    fun setName(name: String) {
        this.name = name
    }
    fun getName(): String {
        return name
    }
    fun setEmail(email: String) {
        this.email = email
    }
    fun getEmail(): String {
        return email
    }
    fun displayUser() {
        println("Name: $name:")
        println("Email: $email")
    }
}