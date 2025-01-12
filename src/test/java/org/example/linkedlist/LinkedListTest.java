package org.example.linkedlist;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    @Test
    void testAddAndPrintList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        assertEquals(3, list.size());

        list.printList();
    }

    @Test
    void testAddAtIndex() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.add(1, 15);

        assertEquals(4, list.size());
        assertEquals(15, list.get(1));
        assertTrue(list.contains(15));
    }

    @Test
    void testSet() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);


        list.set(1, 25);
        assertEquals(25, list.get(1));
        assertTrue(list.contains(25));
        assertFalse(list.contains(20));


        list.set(0, 5);
        assertEquals(5, list.get(0));

        list.set(2, 35);
        assertEquals(35, list.get(2));
    }


    @Test
    void testSetOutOfBounds() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);


        assertThrows(IndexOutOfBoundsException.class, () -> list.set(2, 30));
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(-1, 5));
    }


    @Test
    void testContains() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        assertTrue(list.contains(20));
        assertFalse(list.contains(40));
        assertTrue(list.contains(10));
        assertTrue(list.contains(30));
    }


    @Test
    void testClear() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.clear();

        assertEquals(0, list.size());
        assertTrue(list.isEmpty());
    }

    @Test
    void testRemove() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        int removedElement = list.remove(1);

        assertEquals(20, removedElement);
        assertEquals(2, list.size());
        assertFalse(list.contains(20));
    }

    @Test
    void testRemoveInvalidIndex() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);


        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(5));
    }

    @Test
    void testAddAtInvalidIndex() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);


        assertThrows(IndexOutOfBoundsException.class, () -> list.add(5, 30));
    }

    @Test
    void testSetInvalidIndex() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);


        assertThrows(IndexOutOfBoundsException.class, () -> list.set(3, 15));
    }

    @Test
    void testGetFirstAndLast() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        assertEquals(10, list.getFirst());
        assertEquals(30, list.get(list.size() - 1));
    }

    @Test
    void testGetFirstOnEmptyList() {
        LinkedList<Integer> list = new LinkedList<>();


        assertThrows(NoSuchElementException.class, list::getFirst);
    }

    @org.junit.Test
    public void of() {
    }

    @org.junit.Test
    public void get() {
    }

    @org.junit.Test
    public void getFirst() {
    }

    @org.junit.Test
    public void getLast() {
    }

    @org.junit.Test
    public void add() {
    }

    @org.junit.Test
    public void testAdd() {
    }

    @org.junit.Test
    public void addAll() {
    }

    @org.junit.Test
    public void set() {
    }

    @org.junit.Test
    public void contains() {
    }

    @org.junit.Test
    public void remove() {
    }

    @org.junit.Test
    public void printList() {
    }

    @org.junit.Test
    public void size() {
    }

    @org.junit.Test
    public void isEmpty() {
    }

    @org.junit.Test
    public void clear() {
    }

    @org.junit.Test
    public void getSize() {
    }
}
