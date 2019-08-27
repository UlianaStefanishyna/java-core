package com.core.algorithms.graphs;

import lombok.Data;

import java.util.ArrayList;

public class GraphImpl {

    @Data
    private static class Node {
        private int value;
        private ArrayList<Edge> edges;
    }

    @Data
    private static class Edge {
        private Node destination;
        private int weight;
    }

    @Data
    public class Graph {
        public ArrayList<Node> nodes;
    }

    public boolean search (Node root, Node dest) {
        if (root.value == dest.value) {
            return true;
        }
        return false;
    }
}
