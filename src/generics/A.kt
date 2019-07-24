package generics

open class A
class B : A()

fun copy(from: Array<B>, to: Array<A>) {
    for (i in from.indices)
        to[i] = from[i]
}

fun main(args: Array<String>) {
    var arrayA: Array<A> = arrayOf(A(), A())
    var arrayB: Array<B> = arrayOf(B(), B())
    copy(arrayB, arrayA)

}

internal interface Source<in T, out R> {
    fun mapT(t: T): Unit
    fun nextR(): R
}
