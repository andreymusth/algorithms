package linkedlist

class DoublyLinkedList {

    private var first: Link? = null
    private var last: Link? = null


    fun insertFirst(key: Int) {

        val newLink = Link(key)

        if (isEmpty()) {
            last = newLink
        } else {
            first?.previous = newLink
        }

        newLink.next = first
        first = newLink

    }

    fun insertLast(key: Int) {

        val newLink = Link(key)

        if (isEmpty()) {
            first = newLink
        } else {
            last?.next = newLink
            newLink.previous = last
        }

        last = newLink

    }

    fun deleteFirst(): Int? {

        val temp = first

        if (first?.next == null) {
            last = null
        } else {
            first?.next?.previous = null
        }

        first = first?.next
        return temp?.iData

    }

    fun deleteLast(): Int? {

        val temp = last

        if (last?.previous == null) {
            first = null
        } else {
            last?.previous?.next = null
        }

        last = last?.previous
        return temp?.iData

    }

    fun delete(key: Int): Int? {


        var current = first

        while (current?.iData != key) {
            if (current == null) {
                return null
            }
            current = current.next
        }


        if (current == first) {
            first = current.next
        } else {
            current.previous?.next = current.next
        }

        if (current == last) {
            last = current.previous
        } else {
            current.next?.previous = current.previous
        }

        return current.iData
    }

    fun insertAfter(key: Int, iData: Int): Boolean {

        var current = first

        while (current?.iData != key) {
            current = current?.next

            if (current == null) {
                return false
            }
        }

        val newLink = Link(iData)

        if (current == last) {

            newLink.next = null
            last = newLink

        } else {

            current.next?.previous = newLink
            newLink.next = current.next
        }

        newLink.previous = current
        current.next = newLink

        return true

    }

    fun displayForward() {

        var current = first

        println("Displaying forward")

        while (current != null) {
            current.displayLink()
            current = current.next
        }

    }

    fun displayBackward() {

        var current = last

        println("Displaying backward")

        while (current != null) {
            current.displayLink()
            current = current.previous
        }

    }

    fun isEmpty(): Boolean {
        return first == null
    }

}