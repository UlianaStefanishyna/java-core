package com.core.algorithms.binarytree;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class BinarySearchTreeTest {

    @Test
    public void testCreateBST() {
        BinarySearchTree bst = new RecursiveBinarySearchTree();
    }

    @Test
    public void testInsertIntoEmptyTree() {
        BinarySearchTree bst = new RecursiveBinarySearchTree();

        boolean inserted = bst.insert(35);

        assertTrue(inserted);
    }

    @Test
    public void testInsertTestElementTwice() {
        BinarySearchTree bst = new RecursiveBinarySearchTree();

        bst.insert(43);
        boolean insertedTwo = bst.insert(43);

        assertFalse(insertedTwo);
    }

    @Test
    public void testInsertElements() {
        BinarySearchTree<Integer> bst = RecursiveBinarySearchTree.of(23, 65, 7);

        boolean insertedNew = bst.insert(77);
        boolean insertedExisting = bst.insert(65);
        boolean insertedRootSecond = bst.insert(23);

        assertTrue(insertedNew);
        assertFalse(insertedRootSecond);
        assertFalse(insertedExisting);
    }

    @Test
    public void testInOrderTraversal() {
        BinarySearchTree<Integer> bst = RecursiveBinarySearchTree.of(23, 65, 7, 100);

        List<Integer> bstElements = new ArrayList<>();
        bst.inOrderTraversal(bstElements::add);

//        assertThat(bstElements, );
    }
}
