package org.example.map;


public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();

        myHashMap.put("AaAa", 1);
        myHashMap.put("BBBB", 2);
        myHashMap.put("Cherry", 3);
        myHashMap.put("Date", 4);
        myHashMap.put("Elderberry", 5);

        System.out.println("Value for key 'Apple': " + myHashMap.getValue("Apple"));
        System.out.println("Value for key 'Banana': " + myHashMap.getValue("Banana"));
        System.out.println("Value for key 'NonExisting': " + myHashMap.getValue("NonExisting"));
        System.out.println("Size of map: " + myHashMap.getSize());
        System.out.println("Contents of MyHashMap:");
        System.out.println(myHashMap);
    }
}