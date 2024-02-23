package org.example;

public class Box<T extends Animal & Cloneable> {
    private T animal;

    public Box(T animal) {
        this.animal = animal;
    }


    public void setValue(T animal) {
        this.animal = animal;
    }

    public T getValue() {
        return animal;
    }

    @Override
    public String toString() {
        return "Box{" +
                "animal=" + animal +
                '}';
    }

    public void feed(String food) {
        animal.acceptFood(food);
    }
}
