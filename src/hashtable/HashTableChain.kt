package hashtable

import linkedlist.LinkList

class HashTableChain(private val arraySize: Int) {

    private val hashArray = Array(10) { LinkList() }

    fun insert(key: Int) {

        val hash = hashFunc(key)
        hashArray[hash].insertFirst(key)

    }

    fun delete(key: Int): Int? {

        val hash = hashFunc(key)
        return hashArray[hash].delete(key)?.iData
    }

    fun find(key: Int): Int? {

        val hash = hashFunc(key)
        return hashArray[hash].find(key)?.iData

    }

    fun displayTable() {

        for (i in 0 until arraySize) {
            hashArray[i].displayList()
            println()
        }

    }

    private fun hashFunc(key: Int): Int {
        return key % arraySize
    }
}