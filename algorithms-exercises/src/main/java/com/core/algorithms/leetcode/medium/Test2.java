package com.core.algorithms.leetcode.medium;

import java.util.*;

public class Test2 {

    private String[] sort(String[] logs) {

        Map<String, String> map = new HashMap<>();
        List<String> numbers = new ArrayList<>();
        String[] res = new String[logs.length];

        for (String log : logs) {
            String[] s = log.split(" ");
            if (!s[1].matches("[0-9]+")) {
                map.put(log.substring(log.indexOf(" ") + 1), s[0]);
            } else {
                numbers.add(log);
            }
        }
        SortedSet<String> keys = new TreeSet<>(map.keySet());

        int index = 0;
        for (String key : keys) {
            String value = map.get(key);
            res[index++] = value + " " + key;
        }

        for (String number : numbers) {
            res[index++] = number;
        }
        return res;
    }

    public static void main(String[] args) {
        String[] strings = {"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"};
        String[] sort = new Test2().sort(strings);
        System.out.println(Arrays.toString(sort));
    }
}
