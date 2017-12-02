package com.maxiannicu.console.algorithms;

import com.maxiannicu.console.collections.Enumerable;

public class MultiplyAlgorithm implements Algorithm {
    @Override
    public double compute(Enumerable<Double> values) {
        Enumerable.Iterator<Double> iterator = values.getIterator();
        double result = 1;

        while (!iterator.isDone()) {
            result *= iterator.current();
            iterator.next();
        }

        return result;
    }
}
