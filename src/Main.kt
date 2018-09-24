import array.HighArray


fun main(vararg args: String) {

    val arr = HighArray(20)
    arr.display()
    arr.insert(1)
    arr.insert(2)
    arr.insert(44)
    arr.insert(34)
    arr.insert(23)
    arr.display()

    println()

    arr.delete(44)
    arr.display()
    println()
    arr.delete(2)
    arr.display()

}