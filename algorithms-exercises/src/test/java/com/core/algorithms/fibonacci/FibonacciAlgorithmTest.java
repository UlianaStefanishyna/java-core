package com.core.algorithms.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciAlgorithmTest {

    private FibonacciAlgorithm fibonacci = new FibonacciAlgorithm();

    @Test
    void test_MyFibonacciIteration() {
        int actualResult = this.fibonacci.myFibonacciIteration(11);
        assertEquals(89, actualResult);
    }

    @Test
    void test_MyFibonacciRecursion() {
        int actualResult = this.fibonacci.myFibonacciRecursion(1, 1, 11, 3);
        assertEquals(89, actualResult);
    }
}