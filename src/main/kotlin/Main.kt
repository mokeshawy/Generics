import generic.First
import generic.Second
import generic.Third

fun main(args: Array<String>) {

    val first1 = First<Int,String>()
    first1.type1 = 12
    first1.type2 = "Keshawy"
    first1.setValue(12,"Keshawy")

    val first2 = First<String , Int>()
    first2.type1 = "Mohamed"
    first2.type2 = 24
    first2.setValue("Mohamed Keshawy",20)

    val second = Second<String>()
    second.demo("Mohamed")

    val third = object : Third<Int>(){
        override fun getValue(): Int {
            return 12
        }
    }
    println(third.getValue())
}