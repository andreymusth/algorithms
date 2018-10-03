import array.OrdArray


fun main(vararg args: String) {

    val arr = OrdArray(20)
    arr.display()
    arr.insert(1)
    arr.insert(2)
    arr.insert(44)
    arr.insert(34)
    arr.insert(23)
    arr.display()

    println()

    arr.delete(23)

    println()

    arr.display()

    arr.delete(1)

    println()

    println()

    arr.display()
}