
fun main(args : Array<String>) {
    val myName = "Gaurav"
    println("Hello World")
    var sum = sum(3,5)
    println(sum)
    operator()
    ifStatement()
    whenStatement()
    whenAsExpression(5)
    whenAsExpression(15)
    createArray()
    defaultArgFunc()
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

fun whenAsExpression(monthOfYear : Int) {
    var month = when(monthOfYear){
        1->"January"
        2->"Febuary"
        3->"March"
        4->"April"
        5->"May"
        6->"June"
        7->"July"
        8->"August"
        9->"September"
        10->"October"
        11->"November"
        12->"December"
        else -> {
            println("Not a month of year")
        }
    }
    println(month)
}

fun createArray() {
    var numAray = arrayOf(1,2,3)
    val num = arrayOf<Int>(1,2,3)
    val num2 = Array(5, {i -> i*2})
    for (i in 0..numAray.size-1)
    {
        print(" "+num[i])
    }
    println()
    for (i in 0..num2.size-1)
    {
        println(num2[i])
    }
    println(num2.get(2))

}

fun defaultArgFunc(name: String="Praaven", standard: String="IX", roll_no: Int=11) {
    println("Name of the student is: $name")
    println("Standard of the student is: $standard")
    println("Roll no of the student is: $roll_no")
}