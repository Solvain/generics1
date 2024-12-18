package org.example.stack;

import java.util.Stack;

public class StringStack {

    public static void main(String[] args) {

        Stack<String> stringStack = new Stack<>();

        stringStack.push("Hello");
        stringStack.push("World2");
        stringStack.push("World1");
        stringStack.push("World0");

        System.out.println(stringStack);

        System.out.println(stringStack.peek());


        System.out.println( stringStack.pop());


        System.out.println( stringStack.peek());
    }
}
