package test.datastructure;

import datastructure.Stack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    @Test 
    void testIsEmptyOnNewStack() {
        Stack<Integer> stack = new Stack<>();
        assertTrue(stack.isEmpty(), "A new stack should be empty.");
    }

    @Test
    void testPushAndIsEmpty() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        assertFalse(stack.isEmpty(), "Stack should not be empty after push.");
    }

    @Test 
    void testPushAndPeek() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        assertEquals(1, stack.pop(), "Pop should return last element");
    }

    @Test
    void testPushAndPop() {
        Stack<Character> stack = new Stack<>();
        stack.push('a');
        char popped = stack.pop();
        assertEquals('a', popped, "Pop should return last pushed element.");
        assertTrue(stack.isEmpty(), "Stack should be empty after pushing and popping one element.");
    }

    @Test
    void testPopOrder() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop(), "Stack should pop last pushed element.");
        assertEquals(1, stack.pop(), "Stack should pop 2nd to last pushed element.");
    }

    @Test
    void testPeekShouldNotPop() {
        Stack<String> stack = new Stack<>();
        stack.push("hello world");
        assertEquals("hello world", stack.peek(), "Peek should return value of last popped element.");
        assertFalse(stack.isEmpty(), "Peek should not remove element from stack.");
    }

    @Test
    void testPopOnEmptyStack() {
        Stack<Float> stack = new Stack<>();
        assertThrows(
            exceptions.StackUnderflowException.class, 
            stack::pop, 
            "Popping on empty stack should throw StackUnderflowException"
        );
    }
}
