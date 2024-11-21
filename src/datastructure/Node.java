package datastructure;

public class Node<T> {
    protected T data;
    protected Node<T> next;

    Node(T value) {
        this.data = value;
        this.next = null;
    }

    // getters
    public T GetData() { return this.data; }
    public Node<T> GetNext() {return this.next; }

    // setters 
    public void SetData(T value) { this.data = value; }
    public void SetNext(Node<T> node) { this.next = node; }
}
