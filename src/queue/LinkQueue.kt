package queue

import linkedlist.FirstLastList

class LinkQueue {

    private val list = FirstLastList()

    fun insert(key: Int) {
        list.insertLast(key)
    }

    fun remove(): Int? {
        return list.deleteFirst()?.iData
    }

    fun displayQueue() {
        list.displayList()
    }

    fun isEmpty(): Boolean {
        return list.isEmpty()
    }
}