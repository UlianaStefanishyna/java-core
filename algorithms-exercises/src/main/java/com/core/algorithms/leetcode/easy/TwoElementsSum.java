package com.core.algorithms.leetcode.easy;

public class TwoElementsSum {
    /**
     * @param nums   unsorted array of integers
     * @param target integer value which has to be result of summarizing of two integers from the array
     * @return integer array of size 2 with two indexes of elements which sum is the target element
     * @throws IllegalArgumentException when there are no such elements in the array
     *                                  <p>
     *                                  - Time complexity : O(n). We traverse the list containing n elements exactly twice.
     *                                  Since the hash table reduces the look up time to O(1), the time complexity is O(n).
     *                                  <p>
     *                                  - Space complexity : O(n). The extra space required depends on the number of items
     *                                  stored in the hash table, which stores exactly n elements.
     */
    public int[] twoSumUsingTwoPassHashTable(int[] nums, int target) {
        throw new IllegalArgumentException("There are no such elements that satisfy the condition");
    }

    /**
     * @param nums   unsorted array of integers
     * @param target integer value which has to be result of summarizing of two integers from the array
     * @return integer array of size 2 with two indexes of elements which sum is the target element
     * @throws IllegalArgumentException when there are no such elements in the array
     *                                  <p>
     *                                  - Time complexity : O(n). We traverse the list containing n elements only once.
     *                                  Each look up in the table costs only O(1) time.
     *                                  <p>
     *                                  - Space complexity : O(n). The extra space required depends on the number of items
     *                                  stored in the hash table, which stores at most n elements.
     */
    public int[] twoSumUsingOnePassHashTable(int[] nums, int target) {
        throw new IllegalArgumentException("There are no such elements that satisfy the condition");
    }


    /**
     * @param nums   sorted array of integers
     * @param target integer value which has to be result of summarizing of two integers from the array
     * @return integer array of size 2 with two indexes of elements which sum is the target element
     * @throws IllegalArgumentException when there are no such elements in the array
     *                                  <p>
     *                                  - Time complexity : O(n). We traverse the list containing n elements only once.
     *                                  <p>
     *                                  - Space complexity : O(1). No extra space required since array is sorted and
     *                                  we can use pointers
     */
    public int[] twoSumInSortedArrayUsingTwoPointers(int[] nums, int target) {
        throw new IllegalArgumentException("There are no such elements that satisfy the condition");
    }
}
