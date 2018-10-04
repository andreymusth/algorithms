import array.OrdArray


fun main(vararg args: String) {

    val arr = OrdArray(6)
    arr.display()
    arr.insert(1)
    arr.insert(2)
    arr.insert(24)
    arr.insert(18)
    arr.insert(78)
    arr.insert(11)

    arr.display()

    println()
    val arr2 = OrdArray(3)
    arr2.insert(44)
    arr2.insert(34)
    arr2.insert(23)

    arr2.display()

    println()

    OrdArray.merge(arr, arr2)
}