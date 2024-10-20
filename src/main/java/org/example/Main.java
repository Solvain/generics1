package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s1 = "dfgdsfgswwqosx";
        Object obj = new Object();
        Horse horse = new Horse("gufi");
        Cat cat = new Cat("ttuzik");

        Box<Horse> horseBox = new Box<>(horse);
        Horse value = horseBox.getValue();

        Box<Cat> catBox = new Box<>(cat);
        catBox.feed("Meat");
        System.out.println(horseBox);
        char[] abc = "abc".toCharArray();
        int[] ab = new int[]{0, 1, 2, 5, 7};
        System.out.println(Arrays.toString(ab));
        System.out.println(abc.length);
        System.out.println(abc[2] == 99);
    }
}
