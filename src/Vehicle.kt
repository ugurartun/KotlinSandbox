package src

interface Vehicle {
    fun start()
    fun stop()
}


class Car : Vehicle {
    override fun start() {
        println("Start function")
    }

    override fun stop() {
        println("Stop function")
    }

}
