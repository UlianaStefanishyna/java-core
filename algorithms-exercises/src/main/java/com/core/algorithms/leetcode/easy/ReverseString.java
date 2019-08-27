package com.core.algorithms.leetcode.easy;

import java.util.Arrays;

public class ReverseString {

    private static char[] reverseStringWithExtraSpaceForTheNewArray(char[] s) {
        char[] reversedString = new char[s.length];

        for (int i = s.length - 1, j = 0; i >= 0; i--, j++) {
            reversedString[j] = s[i];
        }
        return reversedString;
    }

    private static char[] reverseStringByModifyingInputArray(char[] s) {

        for (int i = s.length - 1, j = 0; i > (s.length - 1) / 2; i--, j++) {
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
        }
        return s;
    }

    // TODO: 8/27/19 WRITE TESTS INSTEAD OF main() method
    public static void main(String[] args) {
        char[] array = {'h', 'e', 'l', 'l', ' ', 'o'};
//        char[] array = {'A', ' ', 'm', 'a', 'n', ',', ' ', 'a', ' ', 'p', 'l', 'a', 'n',
//                ',', ' ', 'a', ' ', 'c', 'a', 'n', 'a', 'l', ':', ' ', 'P', 'a', 'n', 'a', 'm', 'a'};

        System.out.println("Initial string: " + Arrays.toString(array));
        System.out.println("Array length: " + array.length);

        System.out.println("Reversed string: " + Arrays.toString(reverseStringWithExtraSpaceForTheNewArray(array)));
        System.out.println("Reversed string: " + Arrays.toString(reverseStringByModifyingInputArray(array)));
    }
}
