package queue

import linkedlist.SortedList

class SortedListPriorityQ {

    private val list = SortedList()

    fun isEmpty() = list.isEmpty()

    fun insert(itemToInsert: Int) {
        list.insert(itemToInsert)
    }

    fun remove(): Int? {
        return list.remove()
    }

    fun peek(): Int? {
        return list.peek()
    }

}