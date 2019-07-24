package let

class User(var name: String, var age: Int, var phoneNum: String) {

}


fun main(args: Array<String>) {
    func()
    func2()
    func3()
    func4()
    func5()
}

fun func() {
    val user = User("Kotlin", 1, "1111111")

    val result = with(user) {
        println("my name is $name, I am $age years old, my phone number is $phoneNum")
        1000
    }
    println("result: $result")
}

fun func2() {
    val result = "testLet".let {
        println(it.length)
        1000
    }
    println(result)
}

fun func3() {
    val user = User("Kotlin", 1, "1111111")

    val result = user.run {
        println("my name is $name, I am $age years old, my phone number is $phoneNum")
        1000
    }
    println("result: $result")
}


fun func4() {
    val user = User("Kotlin", 1, "1111111")

    val result = user.apply {
        println("my name is $name, I am $age years old, my phone number is $phoneNum")
        1000
    }
    println("result: $result")
}

fun func5() {
    val result = "testLet".also {
        println(it.length)
        1000
    }
    println(result)
}