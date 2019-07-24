package `interface`

class ImplementsClass : MyInterface, MyInter {
    override fun interface3() {
        println("this is fun interface3")
    }

    override var name: String = "none"

    override fun interface1() {
        println("this is fun interface1")
    }

    override fun interface2() {
        super<MyInterface>.interface2()
        println("ImplementsClass fun interface2")
    }
}