package org.example;

import java.util.*;

public class OOPMainSet {
    public static void main(String[] args) {


        Cat cat1 = new Cat("Vasya");
        Camel camel1 = new Camel("Lama");
        Rabbit rabbit1 = new Rabbit("Bunny");
        Horse horse1 = new Horse("BoBo");

        Set<Animal> animalSet = getAnimalSet(cat1, camel1, rabbit1, horse1);


        System.out.println("Using for-each:");
        for (Animal animal : animalSet) {
            System.out.println(animal);

            Iterator<Animal> iterator = animalSet.iterator();
            System.out.println("Вивести через ітератор:");
            while (iterator.hasNext()) {
                Animal animal1 = iterator.next();
                System.out.println(animal);
            }
        }
    }


    public static Set<Animal> getAnimalSet(Cat cat, Camel camel, Rabbit rabbit, Horse horse) {
        Set<Animal> animalSet = new HashSet<>();
        animalSet.add(cat);
        animalSet.add(horse);
        animalSet.add(rabbit);
        animalSet.add(camel);
        return animalSet;
    }


    public static class Camel extends Animal {
        public Camel(String name) {
            super(name);
        }

        @Override
        public void acceptFood(String food) {

        }

        @Override
        public String toString() {
            return "Camel{" + "name='" + name + '\'' + '}';
        }
    }


    public static class Rabbit extends Animal {
        public Rabbit(String name) {
            super(name);
        }

        @Override
        public void acceptFood(String food) {

        }

        @Override
        public String toString() {
            return "Rabbit{" + "name='" + name + '\'' + '}';
        }
    }


    public static abstract class Animal {
        protected String name;

        public Animal(String name) {
            this.name = name;
        }

        public abstract void acceptFood(String food);

        @Override
        public String toString() {
            return "Animal{" + "name='" + name + '\'' + '}';
        }
    }


    public static class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }

        @Override
        public void acceptFood(String food) {

        }

        @Override
        public String toString() {
            return "Cat{" + "name='" + name + '\'' + '}';
        }
    }


    public static class Horse extends Animal {
        public Horse(String name) {
            super(name);
        }

        @Override
        public void acceptFood(String food) {
        }

        @Override
        public String toString() {
            return "Horse{" + "name='" + name + '\'' + '}';
        }
    }
}
