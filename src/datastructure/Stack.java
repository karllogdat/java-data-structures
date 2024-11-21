package datastructure;

import exceptions.StackUnderflowException;

/**
 * Generic stack implementation in Java, using linked list.
 * <p>
 * Supports functionality for pushing, popping, and peeking operations.
 * 
 * @param <T> Type of elements stored in the stack
 */
public class Stack<T> {
  private Node<T> head;

  /**
   * Initializes an empty stack.
   */
  public Stack() {
    this.head = null;
  }

  /**
   * @return {@code true} if a stack is empty, {@code false} if not
   */
  public boolean isEmpty() {
    return head == null;
  }

  /**
   * Pushes an element to a stack.
   * 
   * @param data Element to push
   */
  public void push(T data) {
    Node<T> newnode = new Node<T>(data);
    newnode.SetNext(this.head);
    this.head = newnode;
  }

  /**
   * Pops the top of stack and return its value.
   * 
   * @return Value of popped element
   * 
   * @throws StackUnderflowException if the stack is empty
   */
  public T pop() {
    if (this.isEmpty()) {
      throw new StackUnderflowException("Trying to pop from empty stack.");
    }

    T value = this.head.GetData();
    this.head = this.head.GetNext();

    return value;
  }

  /**
   * Gets the value of the element at the top of a stack, without removing.
   *  
   * @return Value of peeked element.
   * 
   * @throws StackUnderflowException if stack is empty
   */
  public T peek() {
    if (isEmpty()) {
      throw new StackUnderflowException("Trying to peek in empty stack.");
    }

    return this.head.GetData();
  }
}
