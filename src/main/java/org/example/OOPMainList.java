package org.example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class OOPMainList {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vasya");
        Horse h1 = new Horse("BoBo");
        Animal a1 = new Cat("Barsik");
        Animal a2 = new Horse("Yabluko");

        Cloneable c1 = new Cat("Murzik");
        Cloneable c2 = new Horse("Apple-Horse");
        List<Cloneable> list_1 = new LinkedList<>();
        list_1.add(cat1);
        list_1.add(h1);
        list_1.add(c1);
        list_1.add(c2);
        list_1.add(c2);
        list_1.add(h1);


        for (int i = 0; i < list_1.size(); i++) {
            System.out.println(list_1.get(i));
        }

        System.out.println("                          ***                                **            * ");

        list_1.forEach(System.out::println);

        System.out.println("                          ***                                **            * ");

        Iterator<Cloneable> iterator = list_1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
