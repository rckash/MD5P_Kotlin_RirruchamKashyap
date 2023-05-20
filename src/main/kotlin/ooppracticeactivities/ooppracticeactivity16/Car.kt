package ooppracticeactivities.ooppracticeactivity16

class Car: Vehicle() {
    override fun start() {
        println("Car starts!")
    }

    override fun stop() {
        println("Car stops!")
    }

    override fun accelerate() {
        println("Car is accelerating!")
    }
}