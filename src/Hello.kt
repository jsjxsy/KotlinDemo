class Hello {
    var name:String = "zhangsan"
    var id:Int = 1
}

fun main(args: Array<String>) {
    var h = Hello()
    var name = h.name
    var id = h.id
    print("hello $name  $id");
}