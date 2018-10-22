package stack

import linkedlist.LinkList

class LinkStack {

    private val list = LinkList()

    fun push(j: Int) {
        list.insertFirst(j)
    }

    fun pop(): Int? {
        return list.deleteFirst()?.iData
    }

    fun isEmpty(): Boolean {
        return list.isEmpty()
    }

    fun displayStack() {
        list.displayList()
    }

}