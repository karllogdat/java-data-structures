public class Test {
  public static void main(String[] args) {
    System.out.println("Hello, world.");

    Stack<Integer> intStack = new Stack<Integer>();
    intStack.Push(1);
    intStack.Push(3);
    intStack.Push(2);

    for (int i = 0; i < 4; i++) {
      System.out.println(intStack.Pop());
    }
  }
}