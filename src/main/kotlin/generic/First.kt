package generic

class First<T, E> {
    var type1: T? = null
    var type2: E? = null

    fun setValue(a: T, e: E) {
        println("A = $a E = $e")
    }

    fun getValue(a: T): T {
        return a
    }
}