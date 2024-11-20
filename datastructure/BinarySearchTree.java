package datastructure;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {

    // get successor 
    public BinaryTreeNode<T> Successor(BinaryTreeNode<T> node) {
        while (node.GetLeft() != null) {
            node = node.GetLeft();
        }

        return node;
    }

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
        root = DeleteRecursive(root, value);
    }

    private BinaryTreeNode<T> DeleteRecursive(BinaryTreeNode<T> node, T value) {
        // if value not found
        if (node == null) {
            return null;
        }

        if (value.compareTo(node.GetData()) < 0) {
            node.SetLeft(DeleteRecursive(node.GetLeft(), value));
        } else if (value.compareTo(node.GetData()) > 0) {
            node.SetRight(DeleteRecursive(node.GetRight(), value));
        } else {
            // once the DeleteRecursive finds the right node (recursively)

            // case 1: if node is a leaf
            if (node.GetLeft() == null && node.GetRight() == null) {
                // we set the previous node's child to null
                return null;
            }

            // case 2: node has 1 child
            if (node.GetLeft() == null) {
                return node.GetRight();
            }
            if (node.GetRight() == null) {
                return node.GetLeft();
            }

            // case 3: node has 2 children
            // find the in-order successor of the node 
            BinaryTreeNode<T> successor = Successor(node.GetRight());
            node.SetData(successor.GetData());
            node.SetRight(DeleteRecursive(node.GetRight(), successor.GetData()));
        }

        return node;
    }
}
