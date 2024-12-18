package org.example.stack;

import java.util.Stack;


class AnimalStack {
    private String name;
    public String type;

    @Override
    public String toString() {
        return STR."Animal{name'\{name}'Type}\{type}";
    }
}

public class animalStack {
    public static void main(String[] args) {
        Stack<Animal> animalStack = new Stack<>();
        animalStack.push(new Animal("Leo", "Owl"));
        animalStack.push(new Animal("Korshun", "Bird"));

        System.out.println(animalStack.peek());


        System.out.println(animalStack.pop());


        System.out.println(animalStack.peek());

    }
}