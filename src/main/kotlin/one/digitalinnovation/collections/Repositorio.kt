package one.digitalinnovation.collections

class Repositorio <T> {
    private val map = mutableMapOf<String,T>()
    fun create (id:String, value: funcionario) {
        map [id] = value
    }
    fun findById (id: String) = map[id]
}
