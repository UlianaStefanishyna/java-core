package com.core.algorithms.leetcode.medium;

import lombok.ToString;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TwoIntegers {

    private static ListNode add(ListNode a, ListNode b) {
        Objects.requireNonNull(a);
        Objects.requireNonNull(b);
        Map<Integer, Integer> firstNumber = new HashMap<>();
        Map<Integer, Integer> secondNumber = new HashMap<>();
        int i = 0;
        while (a != null) {
            firstNumber.put(i, a.val);
            a = a.next;
            i++;
        }
        i = 0;
        while (b != null) {
            secondNumber.put(i, b.val);
            b = b.next;
            i++;
        }
        int first = getNumber(firstNumber);
        int second = getNumber(secondNumber);
        int res = first + second;
        String s = String.valueOf(res);
        char[] chars = s.toCharArray();
        ListNode listNode = new ListNode((int) chars[chars.length - 1]);
        for (int i1 = chars.length - 2; i1 >= 0; i1--) {
            listNode.next = new ListNode((int) chars[i1]);
        }

        return listNode;

    }

    private static int getNumber(Map<Integer, Integer> map) {
        int sum = 0;
        int size = map.size();
        for (int i = size - 1; i >= 0; i--) {
            Integer integer = map.get(i);
            sum += integer * Math.pow(10, i);
        }
        return sum;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(2);
        listNode.next = new ListNode(4);
        listNode.next.next = new ListNode(3);

        ListNode listNode1 = new ListNode(5);
        listNode1.next = new ListNode(6);
        listNode1.next.next = new ListNode(4);
        ListNode add = add(listNode, listNode1);
        System.out.println(add);
    }

    @ToString
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
