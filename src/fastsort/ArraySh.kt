package fastsort

class ArraySh(size: Int) {

    private val array = IntArray(size)
    private var nElems = 0

    fun insert(key: Int) {
        array[nElems++] = key
    }

    fun display() {
        for (i in 0 until nElems) {
            print("${array[i]} ")
        }
        println()
    }


    fun shellSort() {

        var inner: Int
        var temp: Int
        var h = 1

        while (h <= nElems / 3) {
            h = h * 3 + 1
        }

        while (h > 0) {

            for (outer in h until nElems) {

                temp = array[outer]
                inner = outer

                while (inner > h - 1 && array[inner - h] > temp) {
                    array[inner] = array[inner - h]
                    inner -= h
                }

                array[inner] = temp

            }

            h = (h - 1) / 3
        }
    }
}