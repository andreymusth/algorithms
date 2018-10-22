import queue.PriorityQ

fun main(vararg args: String) {

    val thePQ = PriorityQ(5)

    thePQ.insert(30)
    thePQ.insert(50)
    thePQ.insert(10)
    thePQ.insert(40)
    thePQ.insert(20)
    while (!thePQ.isEmpty()) {
        val n = thePQ.remove()
        print("$n ")
    }
}