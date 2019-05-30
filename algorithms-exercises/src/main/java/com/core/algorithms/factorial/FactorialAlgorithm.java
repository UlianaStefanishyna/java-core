package com.core.algorithms.factorial;

@SuppressWarnings("all")
public class FactorialAlgorithm {

    public int myFactorial(int n) {
        if (n < 0)
            throw new RuntimeException("Cannot find factorial of negative element");
        else if (n == 0 || n == 1)
            return 1;
        else
            return n * myFactorial(n - 1);
    }
}