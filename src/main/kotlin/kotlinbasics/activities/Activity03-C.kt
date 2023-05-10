import kotlinbasics.kotlinprograms.add

fun main() {
    //data structures declaration
    var groceryArray = arrayListOf<String>(
        "bread", "cheese", "peanut butter", "hotdog", "canned tuna",
        "hair gel", "deodorant", "orange juice", "cornicks", "canned corned beef",
        "oats", "plastic cup", "rubber bands", "rice", "hand sanitizer",
        "soap", "dishwashing soap", "toothpaste", "toothbrush", "table cloth"
    )
    var cartMap = HashMap<String, Int>()

    //default values declaration
    var item = ""
    var amount = 0
    var itemRepeatPrefix = 1

    while (true) {      //loop
        try {
            //menu
            println("Select Task: ")
            println("[1] Add to Cart")
            println("[2] Checkout")
            println("[3] Remove from Cart")
            println("[4] Exit")
            println("\nEnter Selection: ")
            var selection = readln().toInt()        //Task Selection Input

            //process
            when (selection) {
                1 -> {
                    print("Enter Grocery Item: ")       //Add to Cart
                    item = readln()
                    print("Enter Amount: ")
                    amount = readln().toInt()

                    var isInHashMap = cartMap.containsKey(item)
                    if (isInHashMap == true) {
                        itemRepeatPrefix += 1
                        item += "_$itemRepeatPrefix"
                    }

                    addToCart(item, amount, cartMap, itemRepeatPrefix)
                }

                2 -> {
                    checkOut(item, amount, cartMap)
                }

                3 -> {
                    print("Enter Grocery Item to Remove: ")       //Add to Cart
                    item = readln()

                    removeFromCart(item, amount, cartMap)
                }

                4 -> {
                    println("Exiting Program...")
                    break
                }

                else -> {
                    println("Error: Invalid Selection. Choose from 1-4.\n")
                }
            }

        } catch (exception: NumberFormatException) {
            println("Error: Invalid Input. Choose from 1-4.\n")
        }
    }
    println()
}

fun addToCart(item: String, amount: Int, cartMap: HashMap<String, Int>, itemRepeatPrefix: Int) {
    cartMap.put(item, amount)

    println("Cart: ")
    cartMap.forEach {
        println(it)
    }
    println()
}

fun checkOut(item: String, amount: Int, cartMap: HashMap<String, Int>) {
    var total = 0
    cartMap.forEach {
        total += cartMap.get(item)!!
    }
    println(total)
}

fun removeFromCart(item: String, amount: Int, cartMap: HashMap<String, Int>) {
    cartMap.remove(item)
    println("Cart: ")
    cartMap.forEach {
        println(it)
    }
}