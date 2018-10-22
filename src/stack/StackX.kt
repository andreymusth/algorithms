package stack

class StackX(private val maxSize: Int) {

    private val stackArray = IntArray(maxSize)
    private var top = -1

    fun push(j: Int) {
        stackArray[++top] = j
    }

    fun pop() = stackArray[top--]

    fun peek() = stackArray[top]

    fun isEmpty() = top == -1

    fun isFull() = top == maxSize - 1


}