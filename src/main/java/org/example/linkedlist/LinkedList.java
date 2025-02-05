package org.example.linkedlist;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Stream;

public class LinkedList<T> implements MyList<T> {
    private final Node<T> head;
    private int size;
    private Node<T> first;
    private Node<T> last;


    private static class Node<T> {
        T value;
        Node<T> next;
        T data;
        T element;


        Node(T value) {
            this.value = value;
            this.next = null;

        }
    }

    @SafeVarargs
    public static <T> LinkedList<T> of(T... elements) {
        LinkedList<T> linkedList = new LinkedList<>();
        Stream.of(elements).forEach(linkedList::add);
        return linkedList;
    }

    public LinkedList() {
        head = null;
        size = 0;
    }


    private Node<T> findNodeByIndex(int index) {
        Objects.checkIndex(index, size);
        if (index == size - 1) {
            return last;
        } else {
            return nodeAt(index);
        }
    }

    private Node<T> nodeAt(int index) {
        Node<T> currentNode = first;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    @Override
    public T get(int index) {
        Node<T> node = findNodeByIndex(index);
        return node.value;
    }

    @Override
    public T getFirst() {
        checkElementsExist();
        return first.value;
    }

    private void checkElementsExist() {
        if (first == null) {
            throw new NoSuchElementException();
        }
    }

    @Override
    public T getLast() {
        checkElementsExist();
        return last.value;
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (first == null) {
            first = last = newNode;
        } else {
            this.last.next = newNode;
            last = newNode;
        }
        size++;
    }

    private void addAsTail(Node<T> newNode) {
        last.next = newNode;
        last = newNode;
    }


    @Override
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<T> newNode = new Node<>(element);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
            if (size == 0) {
                last = newNode;
            }
        } else {
            Node<T> current = getNodeByIndex(index - 1);
            newNode.next = current.next;
            current.next = newNode;
            if (index == size) {
                last = newNode;

            }
        }
        size++;
    }

    private Node<T> getNodeByIndex(int index) {
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public void addAll(List<T> elements) {
        for (T element : elements) {
            add(element);
        }
    }

    public void set(int index, T element) {
        Node<T> node = findNodeByIndex(index);
        node.value = element;
    }

    @Override
    public boolean contains(T element) {
        Node<T> currentNode = first;
        while (currentNode != null) {
            if (currentNode.value.equals(element)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }


    @Override
    public T remove(int index) {
        Objects.checkIndex(index, size);
        T removedElement;
        if (index == 0) {
            removedElement = first.element;
            first = first.next;
            if (first == null) {
                last = null;
            }
        } else {
            Node<T> prev = getNodeByIndex(index - 1);
            removedElement = prev.next.value;
            prev.next = prev.next.next;
            if (index == size - 1) {
                last = prev;
            }
        }
        size--;
        return removedElement;
    }


    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " = ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    public void clear() {
        first = last = null;
        size = 0;
    }

}




