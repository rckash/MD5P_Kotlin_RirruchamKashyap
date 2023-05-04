fun main() {
    //assertion !!
    //nullable - non-nullable
    var name:String? = "John"
    var newName = name!!

    println(newName)

    //elvis operator
    val name2:String? = "Peter"
    val elvisOperatorResult = name2?: "No null values please"
                                //display name2 if not null, otherwise display "No null values please"
    println(elvisOperatorResult)

    //?.let
    val greeting: String? = null
    val result = greeting?.let{10+10}
                    //display let{} if not null, otherwise display null
    println(result)
}