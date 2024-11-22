import java.util.HashMap;
import java.util.Map;

import datastructure.*;

public class Test {
  public static boolean isInt(String s) {
    try {
      Integer.parseInt(s);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }
  public static void main(String[] args) {
    Map<String, Integer> precedence = new HashMap<>();
    precedence.put("+", 1);
    precedence.put("-", 1);
    precedence.put("*", 2);
    precedence.put("/", 2);
    precedence.put("^", 3);

    Stack<String> stk = new Stack<>();
    Queue<String> out = new Queue<>();

    String infix = "( 1 + 2 ) * 3 - 4 / 5";
    String[] infixStrings = infix.split(" ");

    for (String token : infixStrings) {
      if (isInt(token)) {
        out.Enqueue(token);
      } else if (token == "(") {
        stk.push(token);
      } else if (token == ")") {
        while (!stk.isEmpty() && stk.peek() != "(") {
          out.Enqueue(stk.pop());
        }
        stk.pop();
      } else {
        while (!stk.isEmpty() && stk.peek() != "(" && precedence.get(stk.peek()) >= precedence.get(token)) {
          out.Enqueue(stk.pop());
        }
        stk.push(token);
      }
    }

    while (!stk.isEmpty()) {
      out.Enqueue(stk.pop());
    }

    for (String token : out) {
      System.out.print(token);
    }

    System.out.println("\nDone.");
  }
}