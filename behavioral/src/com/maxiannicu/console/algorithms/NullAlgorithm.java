package com.maxiannicu.console.algorithms;

public class NullAlgorithm implements Algorithm {
    @Override
    public double compute(Enumerable<Double> values) {
        System.out.println("Wrong operation selected");
        return 0;
    }
}
