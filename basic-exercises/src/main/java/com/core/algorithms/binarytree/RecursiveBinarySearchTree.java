package com.core.algorithms.binarytree;

import java.util.function.Consumer;
import java.util.stream.Stream;

@SuppressWarnings("all")
public class RecursiveBinarySearchTree<T extends Comparable> implements BinarySearchTree<T> {

    private Node<T> root;

    public static <T extends Comparable> RecursiveBinarySearchTree<T> of(T... elements) {
        RecursiveBinarySearchTree bst = new RecursiveBinarySearchTree<>();
        Stream.of(elements).forEach(bst::insert);
        return bst;
    }

    @Override
    public boolean insert(T element) {
        if (root == null) {
            this.root = Node.valueOf(element);
            return true;
        } else {
            return insertIntoTree(root, element);
        }
    }

    @Override
    public void inOrderTraversal(Consumer<T> consumer) {
        inOrderTraversal(root, consumer);
    }

    private void inOrderTraversal(Node<T> node, Consumer<T> consumer) {
        if (node != null) {
            inOrderTraversal(node.getLeft(), consumer);
            consumer.accept(node.getElement());
            inOrderTraversal(node.getRight(), consumer);
        }
    }

    private boolean insertIntoTree(Node<T> node, T element) {
        if (node.getElement().compareTo(element) > 0) { // to the left
            return insertIntoLeftSubTree(node, element);
        } else if (node.getElement().compareTo(element) < 0) { // to the right
            return insertIntoRightSubtree(node, element);
        } else {
            return false;
        }
    }

    private boolean insertIntoRightSubtree(Node<T> node, T element) {
        if (node.getRight() == null) {
            node.setRight(Node.valueOf(element));
            return true;
        } else {
            return insertIntoTree(node.getRight(), element);
        }
    }

    private boolean insertIntoLeftSubTree(Node<T> node, T element) {
        if (node.getLeft() == null) {
            node.setLeft(Node.valueOf(element));
            return true;
        } else {
            return insertIntoTree(node.getLeft(), element);
        }
    }
}