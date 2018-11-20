package recursion

class RecursiveCalculator {

    fun multiply(x: Int, y: Int): Int {

        return if (y == 1) {
            x
        } else {
            x + multiply(x, y - 1)
        }

    }

    fun power(x: Int, power: Int): Int {
        return if (power == 1) {
            x
        } else {
            x * (power(x, power - 1))
        }
    }
}