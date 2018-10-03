package array

class OrdArray(size: Int) {

    private val a = LongArray(size)
    var nElems = 0

    fun insert(key: Long) {

        var insertIndex = nElems

        for (i in 0 until nElems) {
            if (key < a[i]) {
                insertIndex = i
                break
            }
        }

        for (i in nElems downTo insertIndex + 1) {
            a[i] = a[i - 1]
        }

        a[insertIndex] = key
        ++nElems
    }

    fun delete(key: Long): Boolean {
        val indexToDelete = find(key)
        if (indexToDelete == -1) {
            return false
        }

        for (i in indexToDelete until nElems) {
            a[i] = a[i + 1]
        }

        a[nElems] = 0
        --nElems

        return true
    }

    fun find(key: Long): Int {

        var leftBound = 0
        var rightBound = nElems - 1
        var middle = nElems / 2

        while (true) {
            if (a[middle] == key) {
                return middle
            }

            if (rightBound < leftBound) {
                return -1
            }

            if (a[middle] < key) {
                leftBound = middle + 1
            } else {
                rightBound = middle - 1
            }

            middle = (leftBound + rightBound) / 2
        }
    }

    fun display() {
        for (i in 0 until nElems) {
            print("${a[i]} ")
        }
    }
}