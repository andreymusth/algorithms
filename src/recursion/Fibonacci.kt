package recursion

class Fibonacci(private val number: Int) {

    fun calculateRec(): Int {
        return fib(number)
    }

    fun calculate(): Int {

        var prev = 0
        var next = 1

        var sum = 0

        for (i in 1 until number) {
            sum = prev + next
            prev = next
            next = sum
        }

        return sum
    }

    private fun fib(num: Int): Int {
        return when (num) {
            0 -> 0
            1 -> 1
            else -> {
                fib(num - 1) + fib(num - 2)
            }
        }
    }
}