package org.example;

public class Horse extends Animal implements Cloneable{
    private String name;

    public Horse(String name) {
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
        return "Horse{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void acceptFood(String food) {
        System.out.println("eating " + food);
    }
}
