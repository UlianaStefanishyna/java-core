package com.core.algorithms.binarytree;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node<T> {

    private T element;

    private Node(T element) {
        this.element = element;
    }

    public static <T> Node<T> valueOf(T value) {
        return new Node<>(value);
    }

    private Node<T> left;
    private Node<T> right;
}
