import queue.SortedListPriorityQ


fun main(vararg args: String) {


    val queue = SortedListPriorityQ()
    queue.insert(20)
    queue.insert(10)
    queue.insert(5)


    println(queue.remove().toString())
    println(queue.remove().toString())
    println(queue.remove().toString())
}