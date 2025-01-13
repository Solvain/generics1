package org.example.arraylist;

public interface mylist<T> {

    void add(T element);

    void add(int index, T element);

    T remove(int index);

    T get(int index);

    boolean contains(T element);

    int size();

    boolean isEmpty();

    void clear();
}


