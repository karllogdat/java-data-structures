package datastructure;

import exceptions.QueueUnderflowException;

public class Queue<T> {
    private Node<T> front;
    private Node<T> back;

    public Queue() {
        this.front = null;
        this.back = null;
    }

    public void Enqueue(T data) {
        Node<T> newnode = new Node<T>(data);
        // check if back is empty then link back to newnode
        if (back != null) {
            back.SetNext(newnode);
        }
        // reassign back to newnode
        back = newnode;

        // in cases where queue is empty, also assign to front
        if (front == null) {
            front = back;
        }
    }

    public T Dequeue() throws QueueUnderflowException {
        if (front == null) {
            throw new QueueUnderflowException("Trying to dequeue an empty queue.");
        }

        T value = front.GetData();
        front = front.GetNext();
        // if front is empty, back must also be empty since the queue is empty
        if (front == null) {
            back = null;
        }

        return value;
    }

    public T Peek() throws QueueUnderflowException {
        if (front == null) {
            throw new QueueUnderflowException("Trying to peek an empty queue.");
        }

        return front.GetData();
    }
}
