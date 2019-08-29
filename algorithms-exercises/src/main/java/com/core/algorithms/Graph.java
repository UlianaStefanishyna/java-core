package com.core.algorithms;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

    private int v; // amount of vertices
    private LinkedList<Integer> adjacencyList[];

    Graph(int v) {
        this.v = v;
        this.adjacencyList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            this.adjacencyList[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w){
        this.adjacencyList[v].add(w);
    }

    void BFS(int s) {
        boolean visited[] = new boolean[v];

        LinkedList<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            s = queue.poll();
            System.out.print(s + ", ");

            Iterator<Integer> i = adjacencyList[s].listIterator();
            while (i.hasNext()) {
                Integer next = i.next();

                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }

    void DFSUtil (int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + ", ");

        Iterator<Integer> i = adjacencyList[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }
    void DFS (int v) {
        boolean[] visited = new boolean[this.v];
        DFSUtil(v, visited);
    }

    public static void main(String args[])
    {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal (starting from vertex 2)");

        g.BFS(2);
        System.out.println();

        System.out.println("Following is Depth First Traversal (starting from vertex 2)");
        g.DFS(2);
    }
}
