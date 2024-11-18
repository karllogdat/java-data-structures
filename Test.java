import datastructure.Stack;

public class Test {
  public static void main(String[] args) {
    System.out.println("Hello, world.");

    Stack<Integer> intStack = new Stack<Integer>();
    
    for (int i = 0; i < 10; i++) {
      intStack.Push(i);
    }

    try {
      for (int i = 0; i < 11; i++) {
        System.out.println(intStack.Pop());
      }
    } catch (Exception e) {
        System.err.println(e.getMessage());
      return;
    }
  }
}