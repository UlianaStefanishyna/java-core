package com.core.algorithms.fibonacci;

@SuppressWarnings("all")
public class FibonacciAlgorithm {

    public int myFibonacciIteration(int index) {

        int first = 1;
        int second = 1;
        int result = 0;

        int counter = 2;

        while (counter < index) {

            result = first + second;

            first = second;
            second = result;

            ++counter;
        }
        return result;
    }

    public int myFibonacciRecursion(int first, int second, int num, int count) {
        return count < num ? myFibonacciRecursion(second, first + second, num, ++count) : first + second;
    }

    public int fibonacciRecursion(int n) {
        if (n < 2)
            return n;
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }
}
