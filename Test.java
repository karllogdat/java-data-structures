import datastructure.Queue;

public class Test {
  public static void main(String[] args) {
    Queue<Integer> queue = new Queue<Integer>();

    for (int i = 0; i < 10; i++) {
      queue.Enqueue(i);
    }

    for (int i = 0; i < 11; i++) {
      try {
        System.out.println(queue.Dequeue());
      } 
      catch (Exception e) {
        System.err.println(e.getMessage());
      }
    }
  }
}