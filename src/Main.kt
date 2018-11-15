import array.OrdArray
import recursion.Factorial
import recursion.TriangleSum


fun main(vararg args: String) {


    val array = OrdArray(10)
    array.insert(5)
    array.insert(3)
    array.insert(20)
    array.insert(13)

    array.display()

    val indexOf13 = array.findRecurcive(13)

    println(indexOf13)


}