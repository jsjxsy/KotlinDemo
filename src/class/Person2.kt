package `class`

class Person2(name: String) {
    var name: String = "li si"
        get() = field.toUpperCase()

    var isMarried: Boolean = false
        get() = true
        set(value) {
            if (value) {
                field = true
            } else {
                field = false
            }
        }

    var heiht: Float = 145.4f
        private set

    lateinit var hello: String
    fun initHello() {
        hello = "Hello,my name is $name"
    }

    class Nested {             // 嵌套类
        fun foo() = 2
    }

    /**嵌套内部类**/
    inner class Inner {
        fun innerTest() {
            var o = this@Person2 //获取外部类的成员变量
            println("内部类可以引用外部类的成员，例如：" + o.name)
        }
    }

    fun setInterFace(test: TestInterFace) {
        test.test()
    }

    /**
     * 定义接口
     */
    interface TestInterFace {
        fun test()
    }

}