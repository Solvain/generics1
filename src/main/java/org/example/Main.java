package org.example;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import org.example.map.MyHashMap;

public class Main {
        private static Map <Integer, Integer> a1 = new HashMap<>() {{
        put( 1, 2);
        put( 2, 2);
    }};
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
        System.out.println(Arrays.toString("abc".getBytes()));
        //Long ggg = Long.parseLong("1001", 2);
        System.out.println(Long.toBinaryString(0b101010100));
        System.out.println(Long.toHexString(0x1c4f));
        Integer ggg = Integer.parseInt("1001", 2);
        Integer aaa = Integer.parseInt("11", 16);
        System.out.println(aaa);
        System.out.println("10".equals(10));
        String str222 = String.valueOf(34.025);
        System.out.println(str222);
        String binaryStr = "1010";
        String hexStr = "1A";

        int binaryNum = Integer.parseInt(binaryStr, 2);
        int hexNum = Integer.parseInt(hexStr, 16);
        System.out.println("Бінарне число 1010 в десятковому форматі: " + binaryNum);
        System.out.println("/nШістнадцяткове число 1A в десятковому форматі: " + hexNum);
        List<Integer> a = new LinkedList<>();
        a.add(1);
//        "AaAa"  same hashcode
//        "BBBB"
//        "AaBB"
//        "BBAa"
        System.out.println("AaAa".hashCode());
        System.out.println("BBBB".hashCode());
        MyHashMap mm = new MyHashMap();
        mm.put("AaAa", new Date());
        mm.put("BBBB", "new node ");
        System.out.println(mm);
    }
}
