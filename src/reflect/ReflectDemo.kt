package reflect
import kotlin.reflect.jvm.*

fun main(args: Array<String>) {
    func()
    func1()

    func3()
    func4()
    func5()
    func6()
    func7()
    func8()
    func9()
}

class ReflectDemo {

}
fun func() {
    val c = ReflectDemo::class
    println("$c")
    val c1 = ReflectDemo::class.java
    println("$c1")


    val d = String::class
    println("$d")
    val d1 = String::class.java
    println("$d1")


}

fun isOdd(x: Int) = x % 2 != 0
fun isOdd(s: String) = s == "brillig" || s == "slithy" || s == "tove"

fun func1() {
    val numbers = listOf(1, 2, 3)
    println(numbers.filter(::isOdd)) // 打印 [1, 3]


    val predicate: (String) -> Boolean = ::isOdd   // 指向 isOdd(x: String)
    println(predicate("tove"))
}



fun func2() {
//    fun length(s: String) = s.length
//
//    val oddLength = compose(::isOdd, ::length)
//    val strings = listOf("a", "ab", "abc")
//
//    println(strings.filter(oddLength)) // 打印了 "[a, abc]"
}

var x = 1
fun func3() {
    println(::x.get()) // prints "1"
    ::x.set(2)
    println(x)         // prints "2"
}



fun func4() {
    val strs = listOf("a", "bc", "def")
    println(strs.map(String::length)) // prints [1, 2, 3]
}


class A(val p: Int)

fun func5() {
    val prop = A::p
    println(prop.get(A(1))) // prints "1"
    println(A::p.get(A(1))) // 输出 "1"
}

val String.lastChar: Char
    get() = this[length - 1]

fun func6() {
    println(String::lastChar.get("abc")) // prints "c"
}


class A1(val p: Int)
fun func7() {
    println(A1::p.javaGetter) // 输出 "public final int A.getP()"
    println(A1::p.javaField)  // 输出 "private final int A.p"
}


class Foo {

}

//factory: () -> Foo 代表Foo类的构造函数
fun function(factory: () -> Foo) {
    val x: Foo = factory()
    println(x)
}

//::Foo 代表类Foo的构造函数引用
fun func8() {
    function(::Foo)
}

fun func9() {
    //传统用法
    val numberRegex = "\\d+".toRegex()
    println(numberRegex.matches("29")) // 输出“true”

    //绑定函数引用,isNumber存储/绑定函数引用
    val isNumber = numberRegex::matches
    println(isNumber("29")) // 输出“true”

    //直接调用函数引用
    val strings = listOf("abc", "124", "a70")
    println(strings.filter(numberRegex::matches)) // 输出“[124]”

    //引用的接收者的类型不再是参数
    //val isNumber: (CharSequence) -> Boolean = numberRegex::matches
    val matches: (Regex, CharSequence) -> Boolean = Regex::matches

    val prop = "abc"::length
    println(prop.get())   // 输出“3”
}