trait Traversal {
  /**
   * Traverse tree in pre order.
   *
   * @param focusNode The starting node
   */
  def preOrderTraverseTree(focusNode: Node) : Unit = {
    if ( focusNode != null ) {
      println(focusNode)
      preOrderTraverseTree(focusNode.leftChild)
      preOrderTraverseTree(focusNode.rightChild)
    }
  }

  /**
   * Traverse tree in order.
   *
   * @param focusNode The starting node
   */
  def inOrderTraverseTree(focusNode: Node) : Unit = {
    if ( focusNode != null ) {
      println(focusNode)
      preOrderTraverseTree(focusNode.leftChild)
      preOrderTraverseTree(focusNode.rightChild)
    }
  }

  /**
   * Traverse tree in post order.
   *
   * @param focusNode The starting node
   */
  def postOrderTraverseTree(focusNode: Node) : Unit = {
    if ( focusNode != null ) {
      println(focusNode)
      preOrderTraverseTree(focusNode.leftChild)
      preOrderTraverseTree(focusNode.rightChild)
    }
  }
}
