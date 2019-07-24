package `fun`

data class Color(var red: Int, var green: Int, var blue: Int) {
    var mobile: String? = null
    operator fun component4(): String {
        return this.mobile!!
    }
}


fun main(args: Array<String>) {
    var color = Color(10, 10, 10)
    color.mobile = "123123"
    var (red, green, blue, mobile) = color

    println("red $red green $green blue $blue mobile $mobile")

}