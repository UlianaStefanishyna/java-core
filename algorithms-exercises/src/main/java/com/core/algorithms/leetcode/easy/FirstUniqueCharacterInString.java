package com.core.algorithms.leetcode.easy;

import java.util.*;

/**
 * @author uliana
 *
 * See the task: <a href="leetcode">https://leetcode.com/problems/first-unique-character-in-a-string/</a>
 */

public class FirstUniqueCharacterInString {

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            Integer integer = map.get(aChar);
            if (integer == null) {
                map.put(aChar, 1);
            } else {
                map.put(aChar, ++integer);
            }
        }

        for (int i = 0; i < chars.length; i++) {
            Integer integer = map.get(chars[i]);
            if(integer == 1){
                return i;
            }
        }

        return -1;
    }

    public int firstUniqCharOnePass(String s) {
        if(s.length() == 0)
            return -1;
        if(s.length() ==1)
            return 0;
        LinkedHashSet<Character> uniqueSet = new LinkedHashSet<>();

        Set<Character> seen = new HashSet<>();
        for(char c: s.toCharArray()){
            if(seen.contains(c)){
                uniqueSet.remove(c);
            }
            else{
                seen.add(c);
                uniqueSet.add(c);
            }
        }
        if(!uniqueSet.isEmpty())
            return s.indexOf(uniqueSet.iterator().next());
        return -1;
    }

    // TODO: 8/27/19 WRITE TESTS INSTEAD OF main() method
    public static void main(String[] args) {
//        int leetcode = new FirstUniqueCharacterInString().firstUniqChar("aadadaad");
//        int leetcode = new FirstUniqueCharacterInString().firstUniqChar("loveleetcode");
//        int leetcode = new FirstUniqueCharacterInString().firstUniqChar("leetcode");
        int leetcode = new FirstUniqueCharacterInString().firstUniqChar("dddccdbba");
        int leetcode1 = new FirstUniqueCharacterInString().firstUniqCharOnePass("dddccdbba");
        System.out.println(leetcode1);
    }
}
