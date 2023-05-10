package ooppracticeactivities.ooppracticeactivity2

class Rectangle(var isShape: Boolean = true) {
    var width: Int = 5
    var height: Int = 7

    fun calculateArea(width: Int, height: Int): Int{
        return width * height
    }
}