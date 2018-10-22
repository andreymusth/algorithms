package array

class HighArray(size: Int) {

    private var a: LongArray = LongArray(size)
    private var nElems: Int = 0

    fun insert(key: Long) {
        a[nElems++] = key
    }

    fun find(key: Long): Long? {

        for (i in 0 until nElems) {
            if (a[i] == key) {
                print("found ${a[i]}")
                return a[i]
            }
        }

        print("no element with key: $key found")
        return null
    }

    fun display() {
        for (i in 0 until nElems) {
            print("${a[i]} ")
        }
    }

    fun delete(key: Long) {

        var ind = -1

        for (i in 0 until nElems) {
            if (a[i] == key) {
                ind = i
                break
            }
        }

        for (i in ind until nElems - 1) {
            a[i] = a[i + 1]
        }

        a[--nElems] = 0

    }

    fun getMax(): Long {

        var max = -1L

        if (nElems == 0) {
            return max
        }

        for (i in 0 until nElems) {
            if (a[i] > max) {
                max = a[i]
            }
        }

        return max
    }

    fun removeMax(): Long {

        var max = -1L
        var maxInd = -1

        if (nElems == 0) {
            return max
        }

        for (i in 0 until nElems) {
            if (a[i] > max) {
                max = a[i]
                maxInd = i
            }
        }

        for (i in maxInd until nElems) {
            a[i] = a[i + 1]
        }

        a[nElems] = 0

        return max
    }

    fun bubbleSort() {

        var out = 0
        var inner = 0

        for (out in 0 until nElems) {
            for (j in 0 until nElems - 1) {
                if (a[j] > a[j + 1]) {
                    val k = a[j + 1]
                    a[j + 1] = a[j]
                    a[j] = k
                }
            }
        }
    }

    fun selectionSort() {

        for (i in 0 until nElems) {

            var min = i

            for (j in i until nElems) {
                if (a[j] < a[min]) {
                    min = j
                }
            }

            val k = a[i]
            a[i] = a[min]
            a[min] = k

        }
    }

    fun insertionSort() {
        for (i in 1 until nElems) {

            var k = i
            val temp = a[i]

            while (k > 0 && temp < a[k - 1]) {
                a[k] = a[k - 1]
                --k
            }

            a[k] = temp
        }
    }

    fun noDups() {

        for (i in 0 until nElems) {

            val current = a[i]
            if (current == -1L) {
                continue
            }

            for (j in i + 1 until nElems) {

                if (a[j] == current && a[j] != -1L) {
                    a[j] = -1
                }
            }
        }

        var i = 0

        while (i < nElems) {
            if (a[i] == -1L) {
                for (j in i until nElems - 1) {
                    a[j] = a[j + 1]
                }
                --nElems
                --i
            }
            ++i
        }

    }

}