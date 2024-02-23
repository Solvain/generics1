package org.example;

public class Cat extends Animal implements Cloneable {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getValue() {
        return name;
    }

    public void setValue(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void acceptFood(String food) {
        System.out.println("eating " + food);
    }
}
