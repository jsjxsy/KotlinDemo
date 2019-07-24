package `class`

class Subclass(var age: Int): Derived(p = 12) {
    override fun sayName() {
        println("say name age $age")
    }
}