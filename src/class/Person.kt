package `class`

//final
open class Person constructor(var name: String ?, var id: Int ?) {

    fun Person(name:String, id:Int){
        this.name = name
        this.id = id
    }

    override fun toString(): String {
        return "id: $id    name: $name"
    }

}
