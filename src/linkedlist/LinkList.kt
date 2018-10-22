package linkedlist

class LinkList {

    var first: Link? = null

    fun isEmpty(): Boolean {
        return first == null
    }

    fun insertFirst(elem: Int) {

        val newLink = Link(elem)

        newLink.next = first
        first = newLink

    }

    fun displayList() {

        var current = first

        while (current != null) {
            current.displayLink()
            current = current.next
        }

    }

    fun deleteFirst(): Link? {

        return if (!isEmpty()) {
            val temp = first
            first = first?.next
            temp
        } else {
            null
        }
    }
}