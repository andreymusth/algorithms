package recursion

class MergeSortedArray(private val size: Int) {

    private val array = IntArray(size)
    private var nElems = 0

    fun display() {
        for (item in 0 until nElems) {
            print("${array[item]} ")
        }
    }

    fun insert(key: Int) {
        array[nElems++] = key
    }

    fun mergeSort() {
        val workSpace = IntArray(size)
        recMergeSort(workSpace, 0, nElems - 1)

    }

    private fun recMergeSort(workSpace: IntArray, lowerIndex: Int, upperIndex: Int) {

        if (lowerIndex == upperIndex) {
            return
        }

        val mid = (lowerIndex + upperIndex) / 2

        // sorting left side
        recMergeSort(workSpace, lowerIndex, mid)
        // sorting right side
        recMergeSort(workSpace, mid + 1, upperIndex)

        merge(workSpace, lowerIndex, mid + 1, upperIndex)

        for (item in workSpace) {
            print("$item ")
        }

        println()

        display()
        println()
        println()
    }

    private fun merge(workSpace: IntArray, lowPtr1: Int, highPtr1: Int, upperIndex: Int) {

        var j = 0
        val mid = highPtr1 - 1
        val n = upperIndex - lowPtr1 + 1
        var lowPtr = lowPtr1
        var highPtr = highPtr1


        while (lowPtr <= mid && highPtr <= upperIndex) {
            if (array[lowPtr] < array[highPtr])
                workSpace[j++] = array[lowPtr++]
            else {
                workSpace[j++] = array[highPtr++]
            }

        }

        while (lowPtr <= mid) {
            workSpace[j++] = array[lowPtr++]
        }


        while (highPtr <= upperIndex) {
            workSpace[j++] = array[highPtr++]
        }


        j = 0

        while (j < n) {
            array[lowPtr + j] = workSpace[j]
            j++
        }
    }
}