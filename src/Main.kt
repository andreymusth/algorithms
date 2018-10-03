import array.HighArray
import array.OrdArray


fun main(vararg args: String) {

    val arr = HighArray(20)
    arr.display()
    arr.insert(1)
    arr.insert(2)
    arr.insert(44)
    arr.insert(34)
    arr.insert(23)
    arr.insert(11)
    arr.insert(24)
    arr.insert(18)
    arr.insert(78)

    arr.display()

    println()

    println(arr.removeMax())
    println()
    arr.display()
    println()
    println(arr.removeMax())
    arr.display()
}