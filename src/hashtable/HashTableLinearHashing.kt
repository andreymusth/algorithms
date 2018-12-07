package hashtable

class HashTableLinearHashing(private val arraySize: Int) {


    private val hashArray = arrayOfNulls<DataItem>(arraySize)
    private val nonItem = DataItem(-1)

    fun find(key: Int): DataItem? {

        var hash = hashFunc(key)

        while (hashArray[hash] != null) {
            if (hashArray[hash]?.key == key) {
                return hashArray[hash]
            }
            ++hash
            hash %= arraySize
        }

        return null
    }

    fun insert(item: DataItem) {

        val key = item.key
        var hash = hashFunc(key)

        while (hashArray[hash] != null && hashArray[hash]?.key != -1) {
            ++hash
            hash %= arraySize
        }

        hashArray[hash] = item
    }

    fun delete(key: Int): DataItem? {

        var hash = hashFunc(key)
        var temp: DataItem? = null

        while (hashArray[hash] != null) {

            if (hashArray[hash]?.key == key) {
                temp = hashArray[hash]
                hashArray[hash] = nonItem

            }

            ++hash
            hash %= arraySize
        }

        return temp

    }

    fun display() {
        println("Table: ")

        for (i in 0 until arraySize) {

            val item = hashArray[i]

            if (item == null) {
                print("** ")
            } else {
                print("${item.key} ")
            }

        }
    }

    private fun hashFunc(key: Int): Int {
        return key % arraySize
    }
}