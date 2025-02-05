package org.example.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.NoSuchElementException;

public class LinkedListTest {

    @Test
    public void testAddAndPrintList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        assertEquals(3, list.size());
        list.printList();
    }

    @Test
    public void testAddAtIndex() {
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
    public void testSet() {
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
    public void testSetOutOfBounds() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);

        assertThrows(IndexOutOfBoundsException.class, () -> list.set(2, 30));
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(-1, 5));
    }

    @Test
    public void testContains() {
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
    public void testClear() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.clear();

        assertEquals(0, list.size());
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
        assertEquals(2, list.size());
        assertFalse(list.contains(20));
    }

    @Test
    public void testRemoveInvalidIndex() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);

        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(5));
    }

    @Test
    public void testAddAtInvalidIndex() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        assertThrows(IndexOutOfBoundsException.class, () -> list.add(5, 30));
    }

    @Test
    public void testSetInvalidIndex() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);

        assertThrows(IndexOutOfBoundsException.class, () -> list.set(3, 15));
    }

    @Test
    public void testGetFirstAndLast() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        assertEquals(10, list.getFirst());
        assertEquals(30, list.getLast());
    }

    @Test
    public void testGetFirstOnEmptyList() {
        LinkedList<Integer> list = new LinkedList<>();
        assertThrows(NoSuchElementException.class, list::getFirst);
    }
}
