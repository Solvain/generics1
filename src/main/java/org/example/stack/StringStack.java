package org.example.stack;

import java.util.Stack;

public class StringStack {
    public static void main(String[] args) {

        Stack<String> stringStack = new Stack<>();


        stringStack.push("Hello");
        stringStack.push("World");


        System.out.println(stringStack.peek());


        System.out.println( stringStack.pop());


        System.out.println( stringStack.peek());
    }
}
