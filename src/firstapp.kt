
fun main(args : Array<String>) {
    val myName = "Gaurav"
    println("Hello World")
    var sum = sum(3,5)
    println(sum)
    operator()
    ifStatement()
    whenStatement()
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

fun ifStatement() {


    var num =15
    var result = if ( num > 0){
        "$num is positive number"
    }
    else if( num < 0){
        "$num is negative number"
    }
    else{
        "$num is equal to zero"
    }
    println(result)
}

fun forLoop() {
    for (i in 1..6) {
        print("$i ")
    }
    println()
    for (i in 1..10 step 3) {
        print("$i ")
    }
    for (i in 5 downTo 1) {
        print("$i ")
    }

    var name = "Geeks"
    var name2 = "forGeeks"

    // traversing string without using index property
    for (alphabet in name)   print("$alphabet ")

    // traversing string with using index property
    for (i in name2.indices) print(name2[i]+" ")
    println(" ")

    // traversing string using withIndex() library function
    for ((index,value) in name.withIndex())
        println("Element at $index th index is $value")
}

fun whenStatement() {
    var str = "mars"
    when(str) {
        "Sun" -> println("Sun is a Star")
        "Moon" -> println("Moon is a Satellite")
        "Earth" -> println("Earth is a planet")
        else -> println("I don't know anything about it")
    }
}