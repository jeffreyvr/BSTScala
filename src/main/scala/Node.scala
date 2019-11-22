class Node(var value: Int) {
  var leftChild:Node = _;
  var rightChild:Node = _;

  def setLeftChild(node: Node) : Unit = {
    this.leftChild = node
  }

  def setRightChild(node: Node) : Unit = {
    this.rightChild = node
  }

  override def toString: String = s"$value"
}