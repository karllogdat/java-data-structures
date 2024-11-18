public class Stack<T> {
  private StackNode<T> head;

  Stack() {
    this.head = null;
  }

  public void Push(T data) {
    StackNode<T> newnode = new StackNode<T>(data);
    newnode.SetNext(this.head);
    this.head = newnode;
  }

  public T Pop() {
    if (this.head == null) {
      System.out.println("Stack Underflow Exception: Trying to pop from empty stack.");
      return null;
    }

    T value = this.head.GetData();
    this.head = this.head.GetNext();

    return value;
  }
}
