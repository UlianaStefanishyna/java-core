package com.core.algorithms.hashtables;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindPairsInUnsortedArray {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 7, 5, 9, 2, 12, 3);
        int k = 2;
        Map<Integer, Integer> res = findPairsInUnsortedArray(list, k);
    }

    private static Map<Integer, Integer> findPairsInUnsortedArray(List<Integer> list, int diff) {

        Map<Integer, Integer> res = new HashMap<>();
        list.forEach(value -> res.put(value, value));

        res.forEach((k, v) -> {
            int bigger = k + diff;
            int lower = k - diff;
            Integer val = res.get(bigger);
            if (val != null) {

            }
        });

        return null;
    }
}
