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

        a[nElems - 1] = 0

    }

}