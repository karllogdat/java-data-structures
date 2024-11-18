package datastructure;

public class Stack<T> {
  private StackNode<T> head;

  public Stack() {
    this.head = null;
  }

  public boolean IsEmpty() {
    return head == null;
  }

  public void Push(T data) {
    StackNode<T> newnode = new StackNode<T>(data);
    newnode.SetNext(this.head);
    this.head = newnode;
  }

  public T Pop() {
    if (this.IsEmpty()) {
      throw new Error("Stack underflow exception: Trying to pop from empty stack.");
    }

    T value = this.head.GetData();
    this.head = this.head.GetNext();

    return value;
  }

  public T Peek() {
    return this.head.GetData();
  }
}
