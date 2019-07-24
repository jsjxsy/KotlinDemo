package list

import java.util.*

fun main(args: Array<String>) {
    list1()
    list2()
    list3()
    list4()
    list5()
}

fun list1() {
    var listOne = listOf("one", "two", "three");
    for ((i, e) in listOne.withIndex()) {
        println("$i $e")
    }
}


fun list2() {
    var map = TreeMap<String, String>()
    map["one"] = "good"
    map["two"] = "good"
    map["three"] = "study"
    map["foue"] = "day"
    map["five"] = "day"
    map["fix"] = "up"
    println(map["fix"])
}


fun list3() {
    var set = hashSetOf("one", "two","three")
    for(str1 in set) {
        println("$str1")
    }
}


fun list4()  {
    val map = hashMapOf(1 to "one",2 to "two",3 to "three")
    for(num in map) {
       println("${num.key} ${num.value}");
    }
}


fun list5() {
    val array = arrayListOf(1,2,3)
    for(num in array) {
        println("$num")
    }
}
