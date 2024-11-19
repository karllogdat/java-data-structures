package datastructure;

import exceptions.StackUnderflowException;

public class Stack<T> {
  private Node<T> head;

  public Stack() {
    this.head = null;
  }

  public boolean IsEmpty() {
    return head == null;
  }

  public void Push(T data) {
    Node<T> newnode = new Node<T>(data);
    newnode.SetNext(this.head);
    this.head = newnode;
  }

  public T Pop() {
    if (this.IsEmpty()) {
      throw new StackUnderflowException("Trying to pop from empty stack.");
    }

    T value = this.head.GetData();
    this.head = this.head.GetNext();

    return value;
  }

  public T Peek() {
    return this.head.GetData();
  }
}
