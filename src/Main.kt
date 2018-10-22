import linkedlist.FirstLastList

fun main(vararg args: String) {

    val theList = FirstLastList()
    theList.insertFirst(22)
    theList.insertFirst(44)
    theList.insertFirst(66)
    theList.insertLast(11)
    theList.insertLast(33)
    theList.insertLast(55)
    theList.deleteFirst()
    theList.deleteFirst()
    theList.displayList()
}