package string

fun main(agrs:Array<String>) {
    val str1 = "abc"
    val str2 = "ABC"
    println(str1.equals(str2, true))
    println(str1.equals(str2, false))

    var str3 = heat(null)
    println(str3)


    StringFunc3(10,4)
}


//加问号参数可以为空
fun heat(str: String?): String {
    return "hot $str"
}


fun StringFunc3(a:Int, b:Int) {
    println("a is ${if(a < b) "smaller" else "bigger" } than b")
}



