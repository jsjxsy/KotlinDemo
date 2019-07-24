package `class`


class Student : Person3 {
    var score: Int = 0
    override var id: Int = 0

    constructor(name: String, age: Int) : super(name, age) {
        println("student name:$name, age:$age")
    }

    constructor(name: String, age: Int, id: Int) : super(name, age) {
        this.id = id
    }

}