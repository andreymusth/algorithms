package iterator

import linkedlist.Link
import linkedlist.LinkList

class ListIterator(private val list: LinkList) {

    var current: Link? = null
        private set

    var previous: Link? = null
        private set

    init {
        reset()
    }

    fun reset() {
        current = list.first
        previous = null
    }

    fun nextLink() {
        previous = current
        current = current?.next
    }

    fun atEnd(): Boolean {
        return current == null
    }

    fun insertAfter(data: Int) {

        val newLink = Link(data)

        if (list.isEmpty()) {

            list.first = newLink
            current = newLink

        } else {

            current?.next = newLink
            newLink.next = current?.next

            nextLink()

        }

    }

    fun insertBefore(data: Int) {

        val newLink = Link(data)

        if (previous == null) {

            newLink.next = list.first
            list.first = newLink

            reset()

        } else {

            previous?.next = newLink
            newLink.next = previous?.next

            current = newLink
        }
    }

    fun deleteCurrent(): Int? {

        val result = current?.iData

        if (previous == null) {
            list.first = current?.next
            reset()
        } else {

            previous?.next = current?.next

            if (atEnd()) {
                reset()
            } else {
                current = current?.next
            }

        }

        return result
    }
}