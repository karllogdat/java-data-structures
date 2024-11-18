package datastructure;

public class StackNode<T> {
  private T data;
  private StackNode<T> next;
  
  StackNode(T value) {
    this.data = value;
    this.next = null;
  }

  public T GetData() {
    return this.data;
  }

  public StackNode<T> GetNext() {
    return this.next;
  }

  public void SetNext(StackNode<T> node) {
    this.next = node;
  }
}
