package org.example.linkedlist;

import java.util.List;

public interface MyList<T> {
    void add(T element);

    void add(int index, T element);

    void addAll(List<T> elements);

    void set(int index, T element);

    T get(int index);

    T getFirst();

    T getLast();

    T remove(int index);

    boolean contains(T element);

    boolean isEmpty();

    int size();

    void clear();
}
