package ooppracticeactivities.ooppracticeactivity16

class Motorcycle: Vehicle() {
    override fun start() {
        println("Motorcycle starts!")
    }
    override fun stop() {
        println("Motorcycle stops!")
    }

    override fun accelerate() {
        println("Motorcycle is accelerating!")
    }
}