package com.core.collections.set;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashSetTaskTest {

    @Test
    public void test_RetainAll() {
        Set<String> first = new HashSet<>();
        Set<String> second = new HashSet<>();

        first.add("one");
        first.add("two");

        first.add("three");
        first.add("four");
        first.add("five");

        second.add("one");
        second.add("two");

        second.add("six");
        second.add("seven");
        second.add("eight");

        first.retainAll(second);

        Set<String> expectedRetainedSet = new HashSet<>();
        expectedRetainedSet.add("one");
        expectedRetainedSet.add("two");

        assertEquals(expectedRetainedSet, first);
    }

    @Test
    public void test_Subtraction() {
        Set<String> first = new HashSet<>();
        Set<String> second = new HashSet<>();

        first.add("one");
        first.add("two");

        first.add("three");
        first.add("four");
        first.add("five");

        second.add("one");
        second.add("two");

        second.add("six");
        second.add("seven");
        second.add("eight");

        first.removeAll(second);

        Set<String> expectedRemovedSet = new HashSet<>();
        expectedRemovedSet.add("three");
        expectedRemovedSet.add("four");
        expectedRemovedSet.add("five");

        assertEquals(expectedRemovedSet, first);
    }

    @Test
    public void test_TreeSet() {
        // Create two sets.
        Set<String> s1 = new HashSet<>();
        s1.add("A");
        s1.add("B");
        s1.add("C");

        Set<String> s2 = new HashSet<>();
        s2.add("A");
        s2.add("B");

        Set<String> union = new TreeSet<>(s1);
        union.addAll(s2); // now contains the union

        System.out.println(union);

        Set<String> intersect = new TreeSet<>(s1);
        intersect.retainAll(s2);

        System.out.println(intersect);
    }
}