package org.example.arraylist;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

        @Test
        public void testAdd() {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(30);

            assertEquals(3, list.size());
            assertEquals(10, list.get(0));
            assertEquals(20, list.get(1));
            assertEquals(30, list.get(2));
        }

        @Test
        public void testAddAtIndex() {
            ArrayList<Integer> list = new ArrayList<>();
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
            ArrayList<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(30);

            list.set(1, 25);
            assertEquals(25, list.get(1));
            assertTrue(list.contains(25));
            assertFalse(list.contains(20));
        }

        @Test
        public void testSetOutOfBounds() {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);

            assertThrows(IndexOutOfBoundsException.class, () -> list.set(2, 30));
            assertThrows(IndexOutOfBoundsException.class, () -> list.set(-1, 5));
        }

        @Test
        public void testContains() {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(30);

            assertTrue(list.contains(20));
            assertFalse(list.contains(40));
        }

        @Test
        public void testClear() {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);

            list.clear();

            assertEquals(0, list.size());
            assertTrue(list.isEmpty());
        }

        @Test
        public void testRemove() {
            ArrayList<Integer> list = new ArrayList<>();
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
            ArrayList<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);

            assertThrows(IndexOutOfBoundsException.class, () -> list.remove(5));
        }

        @Test
        public void testAddAtInvalidIndex() {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);

            assertThrows(IndexOutOfBoundsException.class, () -> list.add(5, 30));
        }

        @Test
        public void testGetFirstAndLast() {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(30);

            assertEquals(10, list.getFirst());
            assertEquals(30, list.getLast());
        }

        @Test
        public void testGetFirstOnEmptyList() {
            ArrayList<Integer> list = new ArrayList<>();

            assertThrows(NoSuchElementException.class, list::getFirst);
        }

        @Test
        public void testGet() {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(30);

            assertEquals(10, list.get(0));
            assertEquals(20, list.get(1));
            assertEquals(30, list.get(2));
        }

        @Test
        public void testGetOutOfBounds() {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(10);

            assertThrows(IndexOutOfBoundsException.class, () -> list.get(5));
        }

        @Test
        public void testIsEmpty() {
            ArrayList<Integer> list = new ArrayList<>();
            assertTrue(list.isEmpty());

            list.add(10);
            assertFalse(list.isEmpty());
        }

        @Test
        public void testOfMethod() {
            ArrayList<Object> list = ArrayList.of(1, 2, 3, 4);

            assertEquals(4, list.size());
            assertEquals(1, list.get(0));
            assertEquals(4, list.get(3));
        }
    }
