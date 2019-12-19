package src

interface Vehicle {
    fun start()
    fun stop()
    fun print()
    {
        println("Default method in defined interface")
    }

    fun add(a: Int, b: Int=5)
}


class Car : Vehicle {
    override fun start() {
        println("Start function")
    }

    override fun stop() {
        println("Stop function")
    }

    override fun add(a: Int, b: Int) {
        val x = a + b
        print("Sum is $x")
    }


}
