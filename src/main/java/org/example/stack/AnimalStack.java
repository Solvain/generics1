package org.example.stack;

import java.util.Stack;

public class AnimalStack {

    public static void main(String[] args) {
        Stack<Animal> animalStack = new Stack<>();

        animalStack.push(new Animal("Leo", "Owl"));

        animalStack.push(new Animal("Korshun", "Bird"));
        System.out.println(animalStack);
        System.out.println(animalStack.peek());

        System.out.println(animalStack.pop());

        System.out.println(animalStack.peek());

    }
}