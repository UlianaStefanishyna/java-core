package com.core.algorithms.binarytree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinarySearchTreeTest {

    @Test
    void testCreateBST() {
        BinarySearchTree bst = new RecursiveBinarySearchTree();
    }

    @Test
    void testInsertIntoEmptyTree() {
        BinarySearchTree bst = new RecursiveBinarySearchTree();

        boolean inserted = bst.insert(35);

        assertTrue(inserted);
    }

    @Test
    void testInsertTestElementTwice() {
        BinarySearchTree bst = new RecursiveBinarySearchTree();

        bst.insert(43);
        boolean insertedTwo = bst.insert(43);

        assertFalse(insertedTwo);
    }

    @Test
    void testInsertElements() {
        BinarySearchTree<Integer> bst = RecursiveBinarySearchTree.of(23, 65, 7);

        boolean insertedNew = bst.insert(77);
        boolean insertedExisting = bst.insert(65);
        boolean insertedRootSecond = bst.insert(23);

        assertTrue(insertedNew);
        assertFalse(insertedRootSecond);
        assertFalse(insertedExisting);
    }

    @Test
    void testInOrderTraversal() {
        BinarySearchTree<Integer> bst = RecursiveBinarySearchTree.of(23, 65, 7, 100);

        List<Integer> bstElements = new ArrayList<>();
        bst.inOrderTraversal(bstElements::add);
    }
}
