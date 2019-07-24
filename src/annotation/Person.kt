package annotation

@Fancy
open class Person @Fancy constructor(name: String, id: Int) {
    @Fancy
    @Fancy
    fun test(@Fancy test: String): Int {
        return (@Fancy 1)
    }


    fun func(a: Int, b: Int) {
        val result = @Fancy { a + b }
    }

}


