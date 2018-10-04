import array.HighArray


fun main(vararg args: String) {

    val arr = HighArray(20)
    arr.insert(1)
    arr.insert(44)
    arr.insert(24)
    arr.insert(11)
    arr.insert(78)
    arr.insert(11)
    arr.insert(44)
    arr.insert(34)
    arr.insert(44)

    arr.display()
    println()

    arr.noDups()
    arr.display()


}