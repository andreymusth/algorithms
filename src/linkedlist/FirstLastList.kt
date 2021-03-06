package linkedlist

class FirstLastList {

    var first: Link? = null
    var last: Link? = null

    fun isEmpty(): Boolean {
        return first == null
    }

    fun insertFirst(data: Int) {

        val newLink = Link(data)

        if (isEmpty()) {
            last = newLink
        }

        newLink.next = first
        first = newLink

    }

    fun insertLast(data: Int) {

        val newLink = Link(data)

        if (isEmpty()) {
            first = newLink
        } else {
            last?.next = newLink
        }

        last = newLink
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

    fun delete(key: Int): Link? {

        var current = first
        var previous = first

        while (current?.iData != key) {
            if (current == null) {
                return null
            } else {
                previous = current
                current = current.next
            }
        }

        if (current == first) {
            first = first?.next
        } else {
            previous?.next = current.next
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