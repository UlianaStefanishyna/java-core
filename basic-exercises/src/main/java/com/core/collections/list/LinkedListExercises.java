package com.core.collections.list;

import java.util.*;

public class LinkedListExercises {
    public static void main(String[] args) {
//        simpleOps();
//        convertToArray();
        sort();
    }

    private static void simpleOps() {

        List<String> linkedList = new LinkedList<String>();
        //Add elements
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");

        System.out.println(linkedList);

        //Add elements at specified position
        linkedList.add(4, "A");
        linkedList.add(5, "A");

        System.out.println(linkedList);

        //Remove element
        linkedList.remove("A");     //removes A
        linkedList.remove(0);       //removes B

        System.out.println(linkedList);

        //Iterate
        for (String s : linkedList) {
            System.out.println(s);
        }

    }

    private static void convertToArray() {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");

//1. LinkedList to Array
        String array[] = new String[linkedList.size()];
        linkedList.toArray(array);

        System.out.println(Arrays.toString(array));

//2. Array to LinkedList
        LinkedList<String> linkedListNew = new LinkedList<String>(Arrays.asList(array));

        System.out.println(linkedListNew);
    }

    private static void sort() {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("A");
        linkedList.add("C");
        linkedList.add("B");
        linkedList.add("D");

//Unsorted
        System.out.println(linkedList);

//1. Sort the list
        Collections.sort(linkedList);

//Sorted
        System.out.println(linkedList);

//2. Custom sorting
        Collections.sort(linkedList, Collections.reverseOrder());

//Custom sorted
        System.out.println(linkedList);
    }
}
