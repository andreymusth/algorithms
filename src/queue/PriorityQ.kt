package queue

import java.lang.UnsupportedOperationException

class PriorityQ(private val maxSize: Int) {

    private val array = IntArray(maxSize)
    private var nElems = 0

    fun isEmpty() = nElems == 0

    fun isFull() = nElems == maxSize

    fun insert(itemToInsert: Int) {

        if (isFull()) {
            throw UnsupportedOperationException("queue is full")
        }

        if (isEmpty()) {
            array[nElems++] = itemToInsert
        } else {

            var indexToInsert = nElems - 1

            while (indexToInsert >= 0 && itemToInsert > array[indexToInsert]) {
                array[indexToInsert + 1] = array[indexToInsert]
                --indexToInsert
            }

            array[++indexToInsert] = itemToInsert
            ++nElems

        }

    }

    fun remove(): Int {
        return array[--nElems]
    }

    fun peek(): Int {
        return array[nElems - 1]
    }
}