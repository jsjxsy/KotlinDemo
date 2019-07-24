package `fun`

fun main(args: Array<String>) {
    valString()

}

fun valString() {
    val result = if (isSuccess()) "success" else "fail"
    println("result $result")
}

fun isSuccess() = true


