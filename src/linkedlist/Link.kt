package linkedlist

data class Link(val iData: Int,
                var next: Link? = null) {

    fun displayLink() {
        println(" { iData: $iData } ")
    }
}