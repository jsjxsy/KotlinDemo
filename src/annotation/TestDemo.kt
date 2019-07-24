package annotation

import kotlin.reflect.KClass

//annotation class Ann(
//        val arg1: KClass<*>,
//        val arg2: KClass<out Any>
//)

//@Ann(String::class, Int::class) class MyClass

//kotlin
//@Ann( "1", intValue = 1, stringValue = "abc")
//@AnnWithArrayValue("1","2","3")
//open class TestDemo {
//
//}


//class Example(@field:Ann val foo,    // annotate Java field
//              @get:Ann val bar,      // annotate Java getter
//              @param:Ann val quux)   // annotate Java constructor parameter





fun @receiver:Fancy String.myExtension() { }