package linkedlist

class SortedList {

    private var first: Link? = null

    fun isEmpty(): Boolean {
        return first == null
    }

    fun insert(key: Int) {

        val newLink = Link(key)

        var current = first
        var previous: Link? = null

        while (current != null && key > current.iData) {
            previous = current
            current = current.next
        }

        if (previous == null) {
            first = newLink
        } else {
            previous.next = newLink
        }

        newLink.next = current


    }

    fun remove(): Int? {

        val temp = first
        first = first?.next

        return temp?.iData
    }

    fun peek(): Int? {
        return first?.iData
    }

    fun displayList() {

        println("Displaying the list: ")

        var current = first

        while (current != null) {
            current.displayLink()
            current = current.next
        }
    }

}