import linkedlist.LinkList

fun main(vararg args: String) {

    val theList = LinkList()
    theList.insertFirst(22)
    theList.insertFirst(44)
    theList.insertFirst(66)
    theList.insertFirst(88)

    theList.displayList()
    println()

    while (!theList.isEmpty()) {
        val aLink = theList.deleteFirst()
        print("Deleted ")
        aLink?.displayLink()
    }
    theList.displayList()

}