# Challenge: Binary Tree in Scala

The challenge is to create a binary search tree with Scala. This has been done during an earlier [assignment](https://github.com/jeffreyvr/BinarySearchTree), but then with Java.

The binary search tree will contain the following:
* Ability to insert a node
* Ability to find a node
* Ability to remove a node
* Ability to order nodes (pre, in, post -order traversal)

If the challenge is not difficult enough, the BST will also include a way to print a diagram version.

## Notes during development
* Not directly clear how you can initialize empty variables from your own class. Looked at several topics online and found a solution using `var leftChild:Node = _;`. 
* Ran into several deprecation notices (having to use for example `: Unit {}`) for function definitions, while using tutorials from around 2015 and 2016.
* Unfortunatly I wasn't able to implement to diagram print method.

## Sources
* [Java Binary Search Tree](https://www.youtube.com/watch?v=M6lYob8STMI)
* [Difference between object and class in Scala](https://stackoverflow.com/questions/1755345/difference-between-object-and-class-in-scala)
* [How to initialize empty variables from your own type in Scala?](https://stackoverflow.com/questions/9934362/how-to-initialize-empty-variables-from-your-own-type-in-scala)