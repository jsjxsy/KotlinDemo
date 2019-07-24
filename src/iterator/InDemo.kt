package iterator

fun main(args: Array<String>) {
    count()
    count2()
    count3()
    count4()
}

fun count() {
    var a = 1..10
    for (b in a) {
        println("num $b")
    }
}


fun count2() {
    var a = 1 until 10
    for (b in a) {
        println("num $b")
    }
}


fun count3() {
    var a = 1 until 10
    for (b in a step 3) {
        println("num $b")
    }
    var nums = a.reversed();

    for (num in nums) {
        println("reversed num $num")
    }
}


fun count4() {
    for (i in 4 downTo 1){
        print(i) //倒叙遍历
    }
}