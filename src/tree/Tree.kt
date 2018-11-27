package tree

class Tree {

    private var root: Node? = null

    fun find(key: Int): Node? {

        var current = root

        while (current != null && current.iData != key) {

            current = if (key > current.iData) {
                current.rightChild
            } else {
                current.leftChild
            }
        }

        return current

    }

    fun insert(key: Int) {

        val newNode = Node(key)

        if (root == null) {
            root = newNode
            return
        }

        var current = root
        var parent: Node? = null

        while (true) {

            parent = current

            if (key > current!!.iData) {

                current = current.rightChild
                if (current == null) {
                    parent?.rightChild = newNode
                    return
                }

            } else {

                current = current.leftChild

                if (current == null) {
                    parent?.leftChild = newNode
                    return
                }
            }
        }
    }

    fun delete(key: Int) {

    }

    private fun inOrder(localRoot: Node?) {

        if (localRoot != null) {

            inOrder(localRoot.leftChild)

            println(localRoot.iData)

            inOrder(localRoot.rightChild)

        }
    }

}