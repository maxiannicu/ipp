package com.maxiannicu.console.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomList<T> implements Enumerable<T> {
    private final List<T> list = new ArrayList<>();

    @Override
    public void add(T value) {
        list.add(value);
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public void remove(T value) {
        list.remove(value);
    }

    @Override
    public T get(int i) {
        return list.get(i);
    }

    @Override
    public Iterator getIterator() {
        return new Iterator();
    }

    public static <U> CustomList<U> fromVArgs(U... args){
        CustomList<U> uCustomList = new CustomList<>();
        Arrays.stream(args)
                .forEach(uCustomList::add);

        return uCustomList;
    }

    public class Iterator implements Enumerable.Iterator<T> {
        private int currentIndex = 0;

        @Override
        public void next() {
            currentIndex++;
        }

        @Override
        public boolean isDone() {
            return currentIndex >= list.size();
        }

        @Override
        public T current() {
            return list.get(currentIndex);
        }
    }
}
