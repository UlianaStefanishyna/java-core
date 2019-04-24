package com.core.algorithms.fibonacci;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciAlgorithmTest {

    private FibonacciAlgorithm fibonacci;

    @Before
    public void init() {
        this.fibonacci = new FibonacciAlgorithm();
    }

    @Test
    public void test_MyFibonacciIteration() {
        int actualResult = this.fibonacci.myFibonacciIteration(11);
        assertEquals(89, actualResult);
    }

    @Test
    public void test_MyFibonacciRecursion() {
        int actualResult = this.fibonacci.myFibonacciRecursion(1, 1, 11, 3);
        assertEquals(89, actualResult);
    }

    @Test
    public void test_FibonacciRecursion() {
        int actualResult = this.fibonacci.fibonacciRecursion(11);
        assertEquals(89, actualResult);
    }
}