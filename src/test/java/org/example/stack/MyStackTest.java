package org.example.stack;

import org.example.stack.MyStack;
import org.junit.jupiter.api.Test;
import java.util.EmptyStackException;
import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

    @Test
    void testPushAndPeek() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(30, stack.peek());
        assertEquals(3, stack.size());
    }

    @Test
    void testPop() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(30, stack.pop());
        assertEquals(20, stack.peek());
        assertEquals(2, stack.size());

        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    void testIsEmpty() {
        MyStack<Integer> stack = new MyStack<>();
        assertTrue(stack.isEmpty());

        stack.push(10);
        assertFalse(stack.isEmpty());
    }

    @Test
    void testPopOnEmptyStack() {
        MyStack<Integer> stack = new MyStack<>();
        assertThrows(EmptyStackException.class, stack::pop);
    }

    @Test
    void testPeekOnEmptyStack() {
        MyStack<Integer> stack = new MyStack<>();
        assertNull(stack.peek());
    }
}
