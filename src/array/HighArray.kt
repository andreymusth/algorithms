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

        for (i in 0 until nElems) {
            if (a[i] == -1L) {
                for (j in i until nElems - 1) {
                    a[j] = a[j + 1]
                }
                --nElems
            }
        }

    }

}