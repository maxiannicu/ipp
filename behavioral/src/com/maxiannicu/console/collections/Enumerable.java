package com.maxiannicu.console.collections;

public interface Enumerable<T> {

    void add(T value);
    int getSize();
    void remove(T value);
    T get(int i);
    Iterator<T> getIterator();

    interface Iterator<T> {
        void next();
        boolean isDone();
        T current();
    }
}
