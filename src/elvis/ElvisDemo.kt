package elvis

import `class`.Person

fun main(args:Array<String>) {
    func()
    func3()
    func4()
    fun_run()
    var list = arrayListOf(1,2,3,4,5,6,7,8)
    forEach_label(list)
}


fun func() {
    var person = Person(null, 1);
    val  name = person.name ?: "unknown"
    val id = person.id ?: return
    var count = name!!.length
    println("name $name  id $id count $count")
}

fun func3() {
    val num = 128
    val a:Int? = num
    val b:Int? = num
    println(a == b)//==判断值是否相等
    println(a === b)//===判断值及引用是否完全相等
}

fun func4() {
    println("${Person::class.java}")
}

fun getStringLength(obj: Any): Int? {
    //obj在&&右边自动动转换成"String"类型
    if (obj is String && obj.length > 0)
        return obj.length
    return null
}


fun func5() {
    val a =""
    val m: Int? = a as? Int
}


fun fun_run(){
    run {
        println("lambda")
    }
    var i: Int = run {
        return@run 1
    }
    println("$i")
    //匿名函数可以通过自定义标签进行跳转和返回
    i = run (outer@{
        return@outer 2
    })
    println(i)
}

fun forEach_label(ints: List<Int>)
{
    var i =2
    ints.forEach {
        //forEach中无法使用continue和break;
//        if (it == 0) continue //编译错误
//        if (it == 2) /*break //编译错误 */
        print(it)
    }
    run outer@{
        ints.forEach {
            if (it == 0) return@forEach //相当于在forEach函数中continue,实际上是从匿名函数返回
            if (it == 2) return@outer //相当于在forEach函数中使用break,实际上是跳转到outer之外
        }
    }

    if (i == 3)
    {
        //每个函数的名字代表一个函数地址，所以函数自动成为标签
        return@forEach_label //等同于return
    }
}

