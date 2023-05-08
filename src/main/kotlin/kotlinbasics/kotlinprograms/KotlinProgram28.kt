package kotlinbasics.kotlinprograms

fun main() {
    // length
    val myText = "Hello World!"
    val stringLength = myText.length
    println(stringLength)

    // lowercase and uppercase
    val upperCase = myText.uppercase()
    val lowerCase = myText.lowercase()
    println(upperCase)
    println(lowerCase)

    // contains
    val searchText = "hello"
    val result = myText.uppercase().contains(searchText.uppercase())
    println(result)

    // replace
    val replacedText = myText.replace("World","Kotlin")
    println(replacedText)

    // accessing by index
    println("${myText[0]} ${myText[11]}")
}