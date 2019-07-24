package `class`


open class Person3 constructor(val name: String, var age: Int) {
    var country: String = "CN"
    open var id: Int = -2
    init {
        println("init country:$country")
    }

    constructor(name: String, age: Int, id: Int) : this(name, age) {
        println("Peson3 id:$id")
        this.id = id
    }
}