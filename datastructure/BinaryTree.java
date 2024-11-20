package datastructure;

public abstract class BinaryTree<T> {
    protected BinaryTreeNode<T> root;

    // override these functions for different binary tree types
    public abstract void Insert(T value);
    public abstract void Delete(T value);
    public abstract BinaryTreeNode<T> Search(T value);

    // create two methods for each taraversal, one starts at root
    // another starts at a user defined starting point
    public void InOrderTraversal() {
        InOrderTraversal(root);
        System.out.println();
    }

    private void InOrderTraversal(BinaryTreeNode<T> node) {
        if (node != null) {
            InOrderTraversal(node.GetLeft());
            System.out.print(node.GetData() + " ");
            InOrderTraversal(node.GetRight());
        }
    }

    public void PreOrderTraversal() {
        PreOrderTraversal(root);
    }

    private void PreOrderTraversal(BinaryTreeNode<T> node) {
        if (node != null) {
            System.out.print(node.GetData() + " ");
            PreOrderTraversal(node.GetLeft());
            PreOrderTraversal(node.GetRight());
        }
    }

    public void PostOrderTraversal() {
        PostOrderTraversal(root);
    }

    private void PostOrderTraversal(BinaryTreeNode<T> node) {
        if (node != null) {
            PreOrderTraversal(node.GetLeft());
            PreOrderTraversal(node.GetRight());
            System.out.print(node.GetData() + " ");
        }
    }
}
