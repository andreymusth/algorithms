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


    fun find(key: Int): Link? {

        var current = first

        while (current?.iData != key) {
            if (current == null) {
                return null
            } else {
                current = current.next
            }
        }

        return current
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