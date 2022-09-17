package generic

class Second<in T> {

    // here not allowed for create variable or return function only function with input when using ( in ) key word with generic class
    fun demo(a : T){
        println("A = $a")
    }
}