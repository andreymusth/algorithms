import stack.LinkStack

fun main(vararg args: String) {

    val theStack = LinkStack()
    theStack.push(20)
    theStack.push(40)
    theStack.displayStack()
    println()
    theStack.push(60)
    theStack.push(80)

    println()
    theStack.displayStack()
    theStack.pop()
    theStack.pop()
    theStack.pop()

    println()

    theStack.displayStack()
}