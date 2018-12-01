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

    fun delete(key: Int): Int? {


        var current = root
        var parent: Node? = null
        var leftChild = false

        while (current != null && current.iData != key) {

            parent = current

            current = if (key > current.iData) {
                leftChild = false
                current.rightChild
            } else {
                leftChild = true
                current.leftChild
            }

        }

        if (current == null) {
            return null
        }


        if (current.leftChild == null && current.rightChild == null) {

            if (leftChild) {
                parent?.leftChild = null
            } else {
                parent?.rightChild = null
            }

        } else if (current.rightChild == null) {
            when {
                current == root -> root = current.leftChild
                leftChild -> parent?.leftChild = current.leftChild
                else -> parent?.rightChild = current.leftChild
            }
        } else if (current.leftChild == null) {

            when {
                current == root -> root = current.rightChild
                leftChild -> parent?.leftChild = current.rightChild
                else -> parent?.rightChild = current.rightChild
            }
        } else {

            val successor = getSuccessor(current)

            when {
                current == root -> root = successor
                leftChild -> parent?.leftChild = successor
                else -> parent?.rightChild = successor
            }

            successor.leftChild = current.leftChild
        }

        return current.iData
    }


    private fun getSuccessor(delNode: Node): Node {

        var successorParent = delNode
        var successor = delNode
        var current = delNode.rightChild

        while (current != null) {

            successorParent = successor
            successor = current
            current = current.leftChild

        }

        if (successor != delNode.rightChild) {
            successorParent.leftChild = successor.rightChild
            successor.rightChild = delNode.rightChild
        }

        return successor

    }

    fun displayInOrder() {
        inOrder(root)
    }

    fun minimum(): Node? {

        var current = root
        var last: Node? = null

        while (current != null) {
            last = current
            current = current.leftChild
        }

        return last
    }

    fun maximum(): Node? {

        var current = root
        var last: Node? = null

        while (current != null) {
            last = current
            current = current.rightChild
        }

        return last
    }

    private fun inOrder(localRoot: Node?) {

        if (localRoot != null) {

            inOrder(localRoot.leftChild)

            println(localRoot.iData)

            inOrder(localRoot.rightChild)

        }
    }

}