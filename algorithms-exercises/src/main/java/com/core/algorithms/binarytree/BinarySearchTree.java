package com.core.algorithms.binarytree;

import java.util.function.Consumer;

public interface BinarySearchTree<T> {
    boolean insert(T i);

    void inOrderTraversal(Consumer<T> consumer);
}