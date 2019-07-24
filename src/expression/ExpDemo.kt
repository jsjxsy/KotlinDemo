package expression

fun main(agrs:Array<String>) {
    result(10)

    var a = { x: Int, y: Int -> x + y }
    var result = a(3, 5)

    println(result)


    var b: (Int, Int) -> Int = { x, y -> x + y }
    var result2 = b(4, 5)
    println(result2)

    var result3 = add(x=10,y=11)
    println(result3)
}



fun result(score: Int) {
    when (score) {
        1 -> println("one")
        2 -> println("two")
        else -> print("other")
    }
}


fun add(x: Int, y: Int) = x + y