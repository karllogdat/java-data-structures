import datastructure.*;

public class Test {
  public static void main(String[] args) {
    Queue<Integer> q = new Queue<>();

    q.Enqueue(1);
    q.Enqueue(3);
    q.Enqueue(4);

    System.out.println("Iterated elements: ");
    for (int number : q) {
      System.out.println("In queue: " + number);
    }

    System.out.println("Dequeued elements: ");
    while (!q.isEmpty()) {
      System.out.println(q.Dequeue());
    }

    System.out.println("Hi world");
  }
}