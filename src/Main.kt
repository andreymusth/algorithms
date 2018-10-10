import array.HighArray


fun main(vararg args: String) {

    val maxSize = 10
    val arr = HighArray(maxSize)

    arr.insert(44)
    arr.insert(24)
    arr.insert(11)
//    arr.insert(78)
    arr.insert(19)
    arr.insert(55)
    arr.insert(34)
    arr.insert(66)
    arr.insert(1)

    println()

    arr.display()
    println()
    arr.insertionSort()
    arr.display()
    println()

    println(arr.median())

}