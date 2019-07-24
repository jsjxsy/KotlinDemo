package `class`

fun main(args: Array<String>) {

    val d = Subclass(12)
    print("subclass ${d.sayName()}")

    val p = Person("zhangsan", 1)
    println("person $p -----name: ${p.name}")

    val p1 = Person(null, null)
    println("person name: ${p1.name}, id: ${p1.id}")

    val p11 = Person1("lisi", 2)
    println("person1 id:${p11.id}, name:${p11.name}")
    //val p22 = Person1(null, null) //error args is not null

    val p3 = Person3("lisi", 2)
    println("person3 name:${p3.name}, age:${p3.age}")

    val p33 = Person3("wangwu", 12, 1)
    println("person3 name:${p33.name}, age:${p33.age}, id:${p33.id}")

    val p2 = Person2("lisi")
    p2.isMarried = true
    //p2.heiht = 14.0f
    p2.initHello()
    val demo = Person2.Nested().foo() // 调用格式：外部类.嵌套类.嵌套类方法/属性
    Person2("www").Inner().innerTest()
    println("person2 name:${p2.name}, isMarried:${p2.isMarried}, id:${p2.heiht}, hello:${p2.hello}, demo:$demo")
    p2.setInterFace(object : Person2.TestInterFace {
        override fun test() {
            println("对象表达式创建匿名内部类的实例")
        }
    })
}