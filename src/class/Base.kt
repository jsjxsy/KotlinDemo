package `class`

//private protect public internal
//这个类具有`open`属性，可以被其他类继承
open class Base(age: Int) {
    //`open`的方法被实现和覆写，该方法也是`open`的
    fun say() {}

    //`final`属性的方法，不可被覆写
    fun sayHello() {}

    //`open`属性的方法，可以被继承和覆写
    open fun sayName() {}
}