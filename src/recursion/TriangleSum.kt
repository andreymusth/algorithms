package recursion

class TriangleSum(private val numberOfColumns: Int) {

    fun calculate(): Int {
        return triangleSum(numberOfColumns)
    }

    fun triangleSum(n: Int): Int {
        return if (n == 1) {
            1
        } else {
            n + triangleSum(n - 1)
        }
    }
}