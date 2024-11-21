package datastructure;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;
    
    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
    
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
    
        return current.data;
    }
    

    public void insertAtHead(T item) {
        Node<T> itemNode = new Node<>(item);
        itemNode.next = head;
        head = itemNode;

        // when list is empty, update tail
        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertAtTail(T item) {
        Node<T> itemNode = new Node<>(item);
        
        if (tail == null) {
            head = itemNode;
            tail = itemNode;
        } else {
            tail.SetNext(itemNode);
            tail = itemNode;
        }

        size++;
    }

    public void insert(int index, T item) {
        Node<T> itemNode = new Node<>(item);

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("List is empty.");
        }

        if (index == 0) {
            insertAtHead(item);
            return;
        }

        if (index == size) {
            insertAtTail(item);
            return;
        }

        // current tracks the node before the index
        Node<T> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        itemNode.next = current.next;
        current.next = itemNode;

        size++;
    }

    public T deleteHead() {
        if (head == null) {
            throw new IllegalStateException("List is empty.");
        }

        T item = head.data;
        head = head.next;

        // change tail to null if list becomes empty
        if (head == null) {
            tail = null;
        }

        size--;
        return item;
    }

    public T deleteTail() {
        if (tail == null) {
            throw new IllegalStateException("List is empty.");
        }

        if (head == tail) {
            T item = head.data;
            head = null;
            tail = null;
            size--;

            return item;
        }

        Node<T> current = head;
        while (current.next != tail) {
            current = current.next;
        }

        T item = tail.data;
        current.next = null;
        tail = current;
        size--;

        return item;
    }

    public T delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        if (index == 0) {
            return deleteHead();
        }

        if (index == size - 1) {
            return deleteTail();
        }

        Node<T> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        T data = current.next.data;
        current.next = current.next.next;
        size--;

        return data;
    }
}
