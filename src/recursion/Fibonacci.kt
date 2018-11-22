package recursion

class Fibonacci(private val number: Int) {

    fun calculateRec(): Int {
        return fib(number)
    }

    fun calculate(): Int {
        var f1 = 0
        var f2 = 1

        for ()
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