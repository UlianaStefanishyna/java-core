package com.core.algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoElementsSumTest {

    private TwoElementsSum twoElementsSum = new TwoElementsSum();

    private int[] sortedArray = new int[]{2, 7, 11, 12};
    private int[] unSortedArray = new int[]{3, 2, 3, 17, 4};

    @Test
    void testTwoElementsSumSortedArrayUsingTwoPassHashTable() {
        int target = 9;
        int[] expectedIndexes = new int[]{0, 1};

        assertArrayEquals(expectedIndexes, twoElementsSum.twoSumUsingTwoPassHashTable(sortedArray, target));
    }

    @Test
    void testTwoElementsSumSortedArrayUsingOnePassHashTable() {
        int target = 9;
        int[] expectedIndexes = new int[]{0, 1};

        assertArrayEquals(expectedIndexes, twoElementsSum.twoSumUsingOnePassHashTable(sortedArray, target));
    }

    @Test
    void testTwoElementsSumSortedArrayUsingTwoPointers() {
        int target = 9;
        int[] expectedIndexes = new int[]{0, 1};

        assertArrayEquals(expectedIndexes, twoElementsSum.twoSumInSortedArrayUsingTwoPointers(sortedArray, target));
    }

    @Test
    void testTwoElementsSumUnSortedArrayUsingTwoPassHashTable() {
        int target = 6;
        int[] expectedIndexes = new int[]{0, 2};

        assertArrayEquals(expectedIndexes, twoElementsSum.twoSumUsingTwoPassHashTable(unSortedArray, target));
    }

    @Test
    void testTwoElementsSumUnSortedArrayUsingOnePassHashTable() {
        int target = 6;
        int[] expectedIndexes = new int[]{0, 2};

        assertArrayEquals(expectedIndexes, twoElementsSum.twoSumUsingOnePassHashTable(sortedArray, target));
    }
}