package ooppracticeactivities.ooppracticeactivity16

abstract class Vehicle(var brand: String = "Suzuki",var year: Int = 1998) {
    abstract fun start()

    abstract fun stop()

    abstract fun accelerate()
}