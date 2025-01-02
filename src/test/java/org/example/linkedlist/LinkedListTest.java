package org.example.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testAddAndPrintList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);


        assertEquals(3, list.getSize());


        list.printList();
    }

    @Test
    public void testAddAtIndex() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.add(1, 15);


        assertEquals(4, list.getSize());


        assertTrue(list.contains(15));
    }

    @Test
    public void testSet() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.set(1, 25);


        assertTrue(list.contains(25));
        assertFalse(list.contains(20));
    }

    @Test
    public void testContains() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        assertTrue(list.contains(20));
        assertFalse(list.contains(40));
    }
    @Test
    public void testClear() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.clear();

        assertEquals(0, list.getSize());
        assertTrue(list.isEmpty());
    }
    @Test
    public void testRemove() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        int removedElement = list.remove(1);


        assertEquals(20, removedElement);


        assertEquals(2, list.getSize());


        assertFalse(list.contains(20));
    }

    @Test
            (expected = IndexOutOfBoundsException.class)
    public void testRemoveInvalidIndex() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.remove(5);
    }

    @Test
            (expected = IndexOutOfBoundsException.class)
    public void testAddAtInvalidIndex() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);

        list.add(5, 30);
    }

    @Test
            (expected = IndexOutOfBoundsException.class)
    public void testSetInvalidIndex() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);

        list.set(3, 15);
    }
}
