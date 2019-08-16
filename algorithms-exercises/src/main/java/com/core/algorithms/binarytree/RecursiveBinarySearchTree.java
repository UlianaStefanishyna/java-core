package com.core.algorithms.binarytree;

import java.util.function.Consumer;

@SuppressWarnings("all")
public class RecursiveBinarySearchTree<T extends Comparable> implements BinarySearchTree<T> {

    private Node<T> root;

    public static <T extends Comparable> RecursiveBinarySearchTree<T> of(T... elements) {
        throw new IllegalArgumentException("Implementation is needed");
    }

    @Override
    public boolean insert(T element) {
        throw new IllegalArgumentException("Implementation is needed");
    }

    @Override
    public void inOrderTraversal(Consumer<T> consumer) {
        throw new IllegalArgumentException("Implementation is needed");
    }

    private void inOrderTraversal(Node<T> node, Consumer<T> consumer) {
        throw new IllegalArgumentException("Implementation is needed");
    }

    private boolean insertIntoTree(Node<T> node, T element) {
        throw new IllegalArgumentException("Implementation is needed");
    }

    private boolean insertIntoRightSubtree(Node<T> node, T element) {
        throw new IllegalArgumentException("Implementation is needed");
    }

    private boolean insertIntoLeftSubTree(Node<T> node, T element) {
        throw new IllegalArgumentException("Implementation is needed");
    }
}