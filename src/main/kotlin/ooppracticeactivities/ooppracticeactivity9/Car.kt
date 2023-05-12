package ooppracticeactivities.ooppracticeactivity9

class Car {
    var make: String
    var model: String
    var year: Int

    //primary constructor
    constructor(make: String, model: String) {
        this.make = make
        this.model = model
        year = 2000
    }

    //secondary constructor
    constructor(make: String, model: String, year: Int) {
        this.make = make
        this.model = model
        this.year = year
    }
}