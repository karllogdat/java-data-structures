import datastructure.*;

public class Test {
  public static void main(String[] args) {
    LinkedList<Integer> llInt = new LinkedList<>();

    llInt.insertAtHead(1);
    llInt.insertAtTail(10);
    llInt.insert(1, 2);

    for (int i = 0; i < llInt.size(); i++) {
      System.out.println(llInt.get(i));
    }

    llInt.delete(1);
    for (int i = 0; i < llInt.size(); i++) {
      System.out.println(llInt.get(i));
    }
    llInt.deleteTail();
    for (int i = 0; i < llInt.size(); i++) {
      System.out.println(llInt.get(i));
    }
    llInt.deleteHead();
    for (int i = 0; i < llInt.size(); i++) {
      System.out.println(llInt.get(i));
    }
  }
}