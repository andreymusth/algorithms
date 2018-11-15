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

    fun findRecurcive(key: Long): Int {
        return recFind(key, 0, nElems - 1)
    }

    private fun recFind(key: Long, lowerBound: Int, upperBound: Int): Int {

        val currentIndex = (lowerBound + upperBound) / 2

        if (a[currentIndex] == key) {
            return currentIndex

        }

        if (lowerBound > upperBound) {
            return -1
        }

        return if (a[currentIndex] > key) {
            recFind(key, lowerBound, currentIndex - 1)
        } else {
            recFind(key, currentIndex + 1, upperBound)
        }

    }

    fun get(i: Int) = a[i]

    fun display() {
        for (i in 0 until nElems) {
            print("${a[i]} ")
        }
    }


    companion object {
        fun merge(arr1: OrdArray, arr2: OrdArray) {

            val result = LongArray(arr1.nElems + arr2.nElems)

            var i = 0
            var j = 0
            var k = 0


            while (i < arr1.nElems && j < arr2.nElems) {
                if (arr1.get(i) < arr2.get(j)) {
                    result[k++] = arr1.get(i++)
                } else {
                    result[k++] = arr2.get(j++)
                }
            }

            for (l in i until arr1.nElems) {
                result[k++] = arr1.get(l)
            }

            for (l in j until arr2.nElems) {
                result[k++] = arr1.get(l)
            }


            for (i1 in 0 until result.size) {
                print("${result[i1]} ")
            }

        }
    }
}