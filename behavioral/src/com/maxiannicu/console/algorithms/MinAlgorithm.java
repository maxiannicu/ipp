package com.maxiannicu.console.algorithms;

import com.maxiannicu.console.collections.Enumerable;

public class MinAlgorithm implements Algorithm {
    @Override
    public double compute(Enumerable<Double> values) {
        Enumerable.Iterator<Double> iterator = values.getIterator();

        boolean wasSet = false;
        double min = 0;
        while (!iterator.isDone()){
            if (min > iterator.current() || !wasSet){
                min = iterator.current();
                wasSet = true;
            }
            iterator.next();
        }

        return min;
    }
}
