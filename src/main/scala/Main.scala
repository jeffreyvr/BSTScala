object Main {
  def main(args: Array[String]): Unit = {
    var tree = new Tree()

    tree.addNode(1)
    tree.addNode(5)
    tree.addNode(3)
    tree.addNode(2)
    tree.addNode(4)

    println("Found node: " + tree.findNode(tree.root, 2))
    println("Found min node: " + tree.findMin(tree.root))
    println("Found max node: " + tree.findMax(tree.root))

    println("In order traversal before remove:")
    tree.inOrderTraverseTree(tree.root)
    tree.removeNode(2)
    println("In order traversal after remove:")
    tree.inOrderTraverseTree(tree.root)
  }
}