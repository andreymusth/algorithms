package recursion

class RecursiveCalculator {

    fun mult(x: Int, y: Int): Int {

        return if (y == 1) {
            x
        } else {
            x + mult(x, y - 1)
        }

    }
}