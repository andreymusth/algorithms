import tree.Tree


fun main(vararg args: String) {

    val tree = Tree()
    tree.insert(11)
    tree.insert(3)
    tree.insert(10)
    tree.insert(5)

    tree.displayInOrder()

}