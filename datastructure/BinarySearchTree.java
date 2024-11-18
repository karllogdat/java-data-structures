package datastructure;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {

    @Override
    public BinaryTreeNode<T> Search(T value) {
        return SearchRecursively(root, value);
    }

    private BinaryTreeNode<T> SearchRecursively(BinaryTreeNode<T> node, T value) {
        // if node is null or key is equal to node value
        if (node == null || value.compareTo(node.GetData()) == 0) {
            return node;
        }

        // read Comparable.compareTo for more information
        if ((value.compareTo(node.GetData()) < 0) == (value.equals(node.GetData()))) {
            return SearchRecursively(node.GetLeft(), value);
        } else {
            return SearchRecursively(node.GetRight(), value);
        }
    }

    // algorithm from BST wikipedia page
    @Override
    public void Insert(T value) {
        BinaryTreeNode<T> parent = null;
        BinaryTreeNode<T> temp = root;
        BinaryTreeNode<T> newNode = new BinaryTreeNode<T>(value);

        while (temp != null) {
            parent = temp;
            if (value.compareTo(temp.GetData()) < 0) {
                temp = temp.GetLeft();
            } else {
                temp = temp.GetRight();
            }
        }

        if (parent == null) {
            root = newNode;
        } else if (newNode.GetData().compareTo(parent.GetData()) < 0) {
            parent.SetLeft(newNode);
        } else {
            parent.SetRight(newNode);
        }
    }

    @Override
    public void Delete(T value) {

    }
}
