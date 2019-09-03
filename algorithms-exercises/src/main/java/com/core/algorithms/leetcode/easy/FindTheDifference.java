package com.core.algorithms.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author uliana
 * <p>
 * See the task: <a href="leetcode">https://leetcode.com/problems/find-the-difference/</a>
 */

public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Map<Character, Integer> sCharsMap = new HashMap<>();

        for (char sChar : sChars) {
            Integer count = sCharsMap.get(sChar);
            sCharsMap.put(sChar, count == null ? 1 : ++count);
        }

        for (char tChar : tChars) {
            Integer integer = sCharsMap.get(tChar);
            if (integer == null) {
                return tChar;
            } else if (integer == 1) {
                sCharsMap.remove(tChar);
            } else {
                sCharsMap.put(tChar, --integer);
            }
        }
        return 0;
    }

    public char findTheDifferenceBinaryOps(String s, String t) {

        int result = 0;

        for (char c : s.toCharArray())
            result = result ^ c;


        for (char c : t.toCharArray())
            result = result ^ c;

        return (char) result;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        char theDifference = new FindTheDifference().findTheDifference(s, t);
        char theDifferenceBinaryOps = new FindTheDifference().findTheDifferenceBinaryOps(s, t);
        System.out.println(theDifferenceBinaryOps);

    }
}
