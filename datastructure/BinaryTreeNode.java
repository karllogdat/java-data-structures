package datastructure;

public class BinaryTreeNode<T> {
    private T data;
    private BinaryTreeNode<T> left;
    private BinaryTreeNode<T> right;

    BinaryTreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    // getters
    public T GetData() { return data; }
    public BinaryTreeNode<T> GetLeft() { return left; }
    public BinaryTreeNode<T> GetRight() { return right; }

    // setters
    public void SetData(T value) { data = value; }
    public void SetLeft(BinaryTreeNode<T> node) { left = node; }
    public void SetRight(BinaryTreeNode<T> node) { right = node; }
}
