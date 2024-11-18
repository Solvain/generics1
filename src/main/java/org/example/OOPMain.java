package org.example;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class OOPMain {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vasya");
        //cat1.acceptFood("sino");


        Horse h1 = new Horse("BoBo");
        //h1.acceptFood("soloma");

        Animal a1 = new Cat("Barsik");
        Animal a2 = new Horse("Yabluko");

        Cloneable c1 = new Cat("Pup");
        Cloneable c2 = new Horse("Pup");
        List<Cloneable> list_1 = new LinkedList<>();
        list_1.add(cat1);
        list_1.add(h1);
        list_1.add(c1);
        list_1.remove(h1);
        list_1.add(c2);


        System.out.println(list_1.contains(c2) + " first");
        System.out.println(list_1.contains(h1));
        System.out.println(list_1.size() + " __size");

        for (int i = 0; i < list_1.size(); i++) {
            System.out.println(list_1.get(i));
        }
        list_1.forEach(System.out::println);

        Set<Integer> set1 = new HashSet<>();

    }
}
