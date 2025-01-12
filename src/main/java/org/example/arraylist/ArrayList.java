package org.example.arraylist;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Stream;

public class ArrayList<T> implements mylist<T> {
    private static final int DEFAULT_CAPACITY = 5;
    private int size;
    private Object[] elements;
    private T element;

    public ArrayList(int initCapacity) {
        if (initCapacity <= 0) {
            throw new IllegalArgumentException("Initial capacity must be greater than 0");
        }
        this.elements = new Object[initCapacity];
        this.size = 0;
    }

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }


    @Override
    public void add(T element) {
        resizeIfNeeded();
        elements[size] = element;
        size++;
    }

    private void resizeIfNeeded() {
        if (elements.length == size) {
            Object[] newArray = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newArray, 0, size);
            elements = newArray;
        }
    }

    @SafeVarargs
    public static <T> ArrayList<Object> of(T... elements) {
        ArrayList<Object> list = new ArrayList<>();
        Stream.of(elements).forEach(list::add);
        return list;
    }

    public void add(int index, T element) {
        Objects.checkIndex(index, size + 1); // allows adding at size (end of list)
        resizeIfNeeded();
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    public T get(int index) {
        Objects.checkIndex(index, size);
        return (T) elements[index];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public T getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
        return get(0);
    }

    public T getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
        return get(size - 1);
    }

    public void set(int index, T element) {
        Objects.checkIndex(index, size);
        elements[index] = element;
    }

    @Override
    @SuppressWarnings(" unchecked")
    public T remove(int index) {
        Objects.checkIndex(index, size);
        T removedElement = (T) elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null; // Prevent memory leak
        return removedElement;
    }

    public int size() {
        return size;
    }

    @Override
    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        size = 0;
        elements = new Object[DEFAULT_CAPACITY];
    }
}



