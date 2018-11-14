package recursion

class Factorial(private val number: Int) {

    fun calculate(): Int {
        return factorial(number)
    }

    private fun factorial(n: Int): Int {
        return if (n == 0) {
            1
        } else {
            n * factorial(n - 1)
        }
    }
}