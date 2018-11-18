import recursion.MergeSortedArray

fun main(vararg args: String) {


    val arr = MergeSortedArray(12)

    arr.insert(64)
    arr.insert(21)
    arr.insert(33)
    arr.insert(70)
    arr.insert(12)
    arr.insert(85)
    arr.insert(44)
    arr.insert(3)
    arr.insert(99)
    arr.insert(0)
    arr.insert(108)
    arr.insert(36)

    arr.display()

    println()
    println()

    arr.mergeSort()

    println()
    println()
    arr.display()

}