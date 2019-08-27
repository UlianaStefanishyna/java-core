package com.core.algorithms.leetcode.easy;

/**
 * The task: Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 */
public class SumOfTwoIntegersWithoutPlusAndMinus {


    /**
     *
     * @param firstTerm is a value in int-range
     * @param secondTerm is a value in int-range
     * @return resulting sum of given two integers without using operator '+' or '-'
     *
     * Time complexity is
     */
    public int calculateRecursively(int firstTerm, int secondTerm) {
        if (secondTerm == 0) {
            return firstTerm;
        }
        return calculateRecursively(firstTerm ^ secondTerm, (firstTerm & secondTerm) << 1);
    }

    public int calculateIteratively(int firstTerm, int secondTerm){
        while (secondTerm != 0){
            int tempFirst = firstTerm;
            firstTerm = firstTerm ^ secondTerm;
            secondTerm = tempFirst & secondTerm;
            secondTerm <<= 1;
        }
        return firstTerm;
    }
}
