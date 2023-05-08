import kotlinprograms.add

fun main() {
    var tableHead = mutableListOf<String>("CATEGORY","BRAND","EXPIRATION DATE", "STOCK AVAILABLE")
    var sardines = mutableListOf("Canned Food","NEGA","01-02-23",40)
    var water = mutableListOf("Beverage","Bear Grand","03-02-23",24)
    var bread = mutableListOf("Pastry","Sardenia","04-07-23",53)
    var cheese = mutableListOf("Dairy","Bear Grand","01-12-23",12)
    var mayonnaise = mutableListOf("Dairy","Sardenia","01-22-23",10)

    //input for item check
    print("Enter Item to check: ")
    var itemName = readln().lowercase()

    //process + output for item check
    queryItem(tableHead, itemName, sardines, water, bread, cheese, mayonnaise)
}

fun queryItem(
    tableHead: MutableList<String>,
    itemName: String,
    sardines: Any,
    water: Any,
    bread: Any,
    cheese: Any,
    mayonnaise: Any
) {
    println(tableHead)
    if (itemName == "sardines") {
        println(sardines)
    } else if (itemName == "water") {
        println(water)
    } else if (itemName == "bread") {
        println(bread)
    } else if (itemName == "cheese") {
        println(cheese)
    } else if(itemName == "mayonnaise") {
        println(mayonnaise)
    } else {
        println("Item does not exist in system")
    }
}