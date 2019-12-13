
fun main(args : Array<String>) {
    val myName = "Gaurav"
    println("Hello World")
    var sum = sum(3,5)
    println(sum)
    operator()
}

fun sum(a: Int, b : Int): Int {
    return a+b
}

fun operator() {
    var a = 20
    var b = 4
    println("a + b = " + a.plus(b))
}

fun conversion() {
    var myLongNumber = 10L
    var myNumber: Int = myLongNumber.toInt()
    println(myNumber)
}