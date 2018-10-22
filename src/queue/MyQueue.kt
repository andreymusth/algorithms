package queue

class MyQueue(private val maxSize: Int) {


    private val array = IntArray(maxSize)
    private var front = 0
    private var rear = -1
    private var nItems = 0

    fun insert(j: Int) {

        if (rear == maxSize - 1) {
            rear = -1
        }

        array[++rear] = j
        nItems++
    }

    fun remove(): Int {
        val temp = array[front++]
        if (front == maxSize) {
            front = 0
        }

        nItems--

        return temp
    }

    fun size() = nItems

    fun isEmpty() = nItems == 0

    fun isFull() = nItems == maxSize
}