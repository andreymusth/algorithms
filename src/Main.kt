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
    println("found element with index ${arr.find(34)}")
}