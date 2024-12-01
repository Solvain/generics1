package org.example;

import java.util.*;

public class OOPMainSet {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Vasya");
        Horse horse1 = new Horse("BoBo");

        Horse h1 = new Horse("h1-horse");
        Animal a1 = new Cat("Barsik");
        Animal a2 = new Horse("Yabluko");

        Set<Animal> list_1 = new HashSet<>();
        list_1.add(cat1);
        list_1.add(horse1);
        list_1.add(h1);
        list_1.add(h1);
        list_1.add(a1);
        list_1.add(a2);
        list_1.add(horse1);


        for (Animal a : list_1) {
            System.out.println(a);
        }

        System.out.println("                          ***                                **            * ");

        list_1.forEach(System.out::println);

        System.out.println("                          ***                                **            * ");

        Iterator<Animal> iterator = list_1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
