class Tree extends Traversal {
  var root:Node = _;

  /**
   * Add node
   *
   * @param value The node value
   */
  def addNode(value: Int) : Unit = {
    val newNode: Node = new Node(value)

    if ( root == null ) {
      this.root = newNode
    } else {
      var focusNode:Node = this.root
      var parent:Node = null

      while(true) {
        parent = focusNode
        if ( value < focusNode.value ) {
          focusNode = focusNode.leftChild
          if ( focusNode == null) {
            parent.leftChild = newNode
            return
          }
        } else {
          focusNode = focusNode.rightChild
          if ( focusNode == null) {
            parent.rightChild = newNode
            return
          }
        }
      }
    }
  }

  /**
   * Find node
   *
   * @param focusNode The focus node
   * @param value The value of the node you are looking for
   * @return Node or null
   */
  def findNode(focusNode: Node, value: Int) : Node = {
    if (focusNode == null) {
      return null
    }

    if (focusNode.value == value) {
      focusNode

    } else {
      val left = findNode(focusNode.leftChild, value)
      val right = findNode(focusNode.rightChild, value)

      if (left != null)
        left
      else
        right
    }
  }

  /**
   * Find the minimum value in the tree.
   *
   * @param focusNode The focus node
   * @return Node or null
   */
  def findMin(focusNode: Node): Node = {
    if (focusNode == null) {
      return null
    }

    if (focusNode.leftChild == null) {
      return focusNode
    }

    findMin(focusNode.leftChild)
  }

  /**
   * Find the maximum value in the tree.
   *
   * @param focusNode
   * @return Node or null
   */
  def findMax(focusNode: Node): Node = {
    if (focusNode == null) {
      return null
    }

    if (focusNode.rightChild == null) {
      focusNode
    } else findMax(focusNode.rightChild)
  }

  /**
   * Remove node
   *
   * @param key key of the node to remove
   * @return true or false
   */
  def removeNode(key: Integer): Boolean = {
    var focusNode = root
    var parent = root
    var isItALeftChild = true

    while (focusNode.value != key) {
      parent = focusNode

      if (key < focusNode.value) {
        isItALeftChild = true
        focusNode = focusNode.leftChild
      } else {
        isItALeftChild = false
        focusNode = focusNode.rightChild
      }

      if (focusNode == null) return false
    }

    if ((focusNode.leftChild == null && focusNode.rightChild == null)) {
      if (focusNode == root) {
        root = null;
      } else if (isItALeftChild) {
        parent.leftChild = null;
      } else {
        parent.rightChild = null;
      }
    } else if (focusNode.rightChild == null) {
      if(focusNode == root) {
        root = focusNode.leftChild;
      } else if(isItALeftChild) {
        parent.leftChild=focusNode.leftChild;
      } else {
        parent.rightChild = focusNode.leftChild;
      }
    } else {
      val replacement: Node = getReplacementNode(focusNode);

      if (focusNode == root) {
        root = replacement;
      } else if (isItALeftChild) {
        parent.leftChild = replacement;
      } else {
        parent.rightChild = replacement;
        replacement.leftChild = focusNode.leftChild;
      }
    }

    true
  }

  /**
   * Get Replacement Node
   *
   * @param replacedNode Node to replace
   * @return replacement node
   */
  def getReplacementNode(replacedNode: Node): Node = {
    var replacementParent = replacedNode
    var replacement = replacedNode
    var focusNode = replacedNode.rightChild

    while (focusNode != null) {
      replacementParent = replacement
      replacement = focusNode
      focusNode = focusNode.leftChild
    }

    if (replacement ne replacedNode.rightChild) {
      replacementParent.leftChild = replacement.rightChild
      replacement.rightChild = replacedNode.rightChild
    }

    replacement
  }
}