package kotlinoop.kotlinoop3

class Person {
    var name: String
    var age: Int

    constructor() {
        //primary constructor
        name = "Default name"
        age = 0
    }

    //secondary constructor
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    //tertiary constructor
    constructor(name: String) {
        this.name = name
        this.age = 0
    }

    constructor(age: Int) {
        this.name = "John"
        this.age = age
    }
}