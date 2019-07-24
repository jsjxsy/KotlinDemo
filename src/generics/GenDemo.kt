package generics

fun main(args: Array<String>) {
    doPrintln(100)
    doPrintln("hello")
    GenDemo("this").func()
}

fun <T> doPrintln(content: T) {
    when (content) {
        is Int -> println("${content % 10}")
        is String -> println("this is String type  content: $content ")
        else -> println("this is other");
    }
}

class GenDemo<T>(t: T) {
    var value = t
    fun func() {
        println("$value")
    }
}