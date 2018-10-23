import queue.LinkQueue

fun main(vararg args: String) {

    val theQueue = LinkQueue()
    theQueue.insert(20)
    theQueue.insert(40)
    theQueue.displayQueue()

    println()

    theQueue.insert(60)
    theQueue.insert(80)
    theQueue.displayQueue()

    println()

    theQueue.remove()
    theQueue.remove()

    println()
    
    theQueue.displayQueue()
}