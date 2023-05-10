

fun main() {
    //input
    print("Enter Integer #1: ")
    var input1 = readln().toInt()
    print("Enter Integer #2: ")
    var input2 = readln().toInt()

    //process
    var highInt = 0
    var lowInt = 0
    var getHigherInt = { input1: Int, input2: Int ->    //function for determining higher value Int
        if (input1 > input2) {
            highInt = input1
            lowInt = input2
        } else {
            highInt = input2
            lowInt = input1
        }
        highInt and lowInt
    }

    getHigherInt(input1, input2)

    var primes = ""
    var printPrime = { lowInt: Int, highInt: Int ->     //function for getting prime numbers between lowInt and highInt
        for (i in lowInt..highInt) {
            var isPrime = false
            for (j in 2..highInt) {
                if (i % j == 0) {
                    break
                } else {
                    isPrime = true
                }
            }
            if (isPrime) {
                primes += "$i, "
            }
        }
        primes.dropLast(2)
    }

    //output
    println("\nLower Int: $lowInt")
    println("Higher Int: $highInt")
    println("Prime Numbers in between: ${printPrime(lowInt, highInt)}")
}