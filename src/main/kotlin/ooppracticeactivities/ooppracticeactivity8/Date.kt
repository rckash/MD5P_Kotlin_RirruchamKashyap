package ooppracticeactivities.ooppracticeactivity8

class Date {
    var day: Int
    var month: String
    var year: Int

    //primary constructor
    constructor() {
        day = 1
        month = "January"
        year = 2000
    }

    //secondary constructor
    constructor(day: Int, month: String, year: Int) {
        this.day = day
        this.month = month
        this.year = year
    }
}