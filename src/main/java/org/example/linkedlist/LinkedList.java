package org.example.linkedlist;


public class LinkedList<T> {
    private Node<T> head;
    private int size;



    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedList() {
        head = null;
        size = 0;
    }


    public void add(T element) {
        Node<T> newNode = new Node<>(element);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }


    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node<T> newNode = new Node<>(element);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }


    public void set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = element;
    }


    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    public boolean contains(T element) {
        Node<T> current = head;
        while (current != null) {
            if ((current.data == null && element == null) || (current.data != null && current.data.equals(element))) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void clear() {
        head = null;
        size = 0;
    }


    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        T removedData;
        if (index == 0) {
            removedData = head.data;
            head = head.next;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            removedData = current.next.data;
            current.next = current.next.next;
        }
        size --;
        return removedData;
    }


    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

}
