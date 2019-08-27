package com.core.algorithms.leetcode.easy;

/**
 * @author uliana
 *
 * See the task: <a href="leetcode">https://leetcode.com/problems/implement-strstr/</a>
 */
public class ImplementStrStr {

    public int strStr(String haystack, String needle) {

        int m = needle.length();

        if (m == 0) {
            return 0;
        }

        char[] chars = haystack.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (m > chars.length - i) {
                return -1;
            } else if (aChar == needle.charAt(0)) {
                String substring = haystack.substring(i, i + m);
                if (substring.equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

    // TODO: 8/27/19 WRITE TESTS INSTEAD OF main() method
    public static void main(String[] args) {
        int i = new ImplementStrStr().strStr("hello", "ll");
        System.out.println(i);
    }
}
