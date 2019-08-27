package com.core.algorithms.leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoIntegersWithoutPlusAndMinusTest {

    private SumOfTwoIntegersWithoutPlusAndMinus solution = new SumOfTwoIntegersWithoutPlusAndMinus();

    @Test
    @DisplayName("Both values are positive and sum is the same binary-digits representation")
    void testSumOfTwoIntegersWithTheSameAmountOfDigits() {

        int first = 1;
        int second = 2;
        int expectedValue = first + second;
        int actualValueRecursivelyFound = solution.calculateRecursively(first, second);
        int actualValueIterativelyFound = solution.calculateIteratively(first, second);
        assertEquals(expectedValue, actualValueRecursivelyFound);
        assertEquals(expectedValue, actualValueIterativelyFound);
    }

    @Test
    @DisplayName("Both values are positive and sum is bigger binary-digits representation")
    void testSumOfTwoIntegersWithTheDifferentAmountOfDigits() {

        int first = 4;
        int second = 7;
        int expectedValue = first + second;
        int actualValueRecursivelyFound = solution.calculateRecursively(first, second);
        int actualValueIterativelyFound = solution.calculateIteratively(first, second);

        assertEquals(expectedValue, actualValueRecursivelyFound);
        assertEquals(expectedValue, actualValueIterativelyFound);
    }

    @Test
    @DisplayName("Negative and positive value sum")
    void testSumOfNegativeAndPositiveValue() {

        int first = -1;
        int second = 5;
        int expectedValue = first + second;
        int actualValueRecursivelyFound = solution.calculateRecursively(first, second);
        int actualValueIterativelyFound = solution.calculateIteratively(first, second);

        assertEquals(expectedValue, actualValueRecursivelyFound);
        assertEquals(expectedValue, actualValueIterativelyFound);
    }

    @Test
    @DisplayName("Both values are negative")
    void testSumOfTwoNegativeValues() {

        int first = -1;
        int second = -4;
        int expectedValue = first + second;
        int actualValueRecursivelyFound = solution.calculateRecursively(first, second);
        int actualValueIterativelyFound = solution.calculateIteratively(first, second);

        assertEquals(expectedValue, actualValueRecursivelyFound);
        assertEquals(expectedValue, actualValueIterativelyFound);
    }
}
