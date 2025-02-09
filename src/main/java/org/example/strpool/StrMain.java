package org.example.strpool;

public class StrMain {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("hello");
        System.out.println(s1 == s3);
        System.out.println(s4.equals(s3));

        System.out.println(" ***************///////////*********************");

        Integer i1 = 200;
        Integer i2 = 200;
        Integer i3 = Integer.parseInt("100");
        Integer i4 = Integer.parseInt("100");

        System.out.println((i1 == i2) + " ___Integer");
        System.out.println((i1.equals(i2)) + " ___Integer");
        System.out.println((i1 == i4) + " ___Integer");
        System.out.println((i3.equals(i4)) + " ___Integer");
    }
}
