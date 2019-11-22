import org.scalatest.FunSuite

class TreeTest extends FunSuite {
    var tree:Tree = _;

    def setup(): Unit = {
        tree = new Tree()
        tree.addNode(2)
        tree.addNode(6)
        tree.addNode(1)
        tree.addNode(4)
        tree.addNode(9)
    }

    test("should_find_node") {
        this.setup()

        assert(tree.findNode(tree.root, 2).value == 2)
    }

    test("should_return_null_on_looking_for_non_existing_node") {
        this.setup()

        assert(tree.findNode(tree.root, 99) == null)
    }

    test("should_return_correct_min_in_tree") {
        this.setup()

        assert(tree.findMin(tree.root).value == 1)
    }

    test("should_return_correct_max_in_tree") {
        this.setup()

        assert(tree.findMax(tree.root).value == 9)
    }

    test("assert_that_node_exists_after_creating") {
        this.setup()

        tree.addNode(10)

        assert(tree.findNode(tree.root,10).value == 10)
    }

    test("assert_removal_works_as_correctly") {
        this.setup()

        tree.removeNode(4)

        assert(tree.findNode(tree.root, 4) == null)
        assert(tree.findNode(tree.root, 6).leftChild == null)

        tree.removeNode(2)

        assert(tree.root.value == 6)
    }
}
