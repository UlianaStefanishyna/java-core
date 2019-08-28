package com.core.algorithms.leetcode.medium;

import java.util.*;

/**
 * @author uliana
 * <p>
 * See the task: <a href="leetcode">https://leetcode.com/problems/course-schedule-ii/</a>
 */

public class CourseScheduleII {

    private static int WHITE = 1;
    private static int GRAY = 2;
    private static int BLACK = 3;

    private boolean isPossible;
    private Map<Integer, Integer> color;
    private Map<Integer, List<Integer>> adjList;
    private List<Integer> topologicalOrder;

    private void init(int numCourses) {

        this.isPossible = true;
        this.color = new HashMap<>();
        this.adjList = new HashMap<>();
        this.topologicalOrder = new ArrayList<>();

        // By default all vertces are WHITE
        for (int i = 0; i < numCourses; i++) {
            this.color.put(i, WHITE);
        }
    }

    private void dfs(int node) {

        // Don't recurse further if we found a cycle already
        if (!this.isPossible) {
            return;
        }

        // Start the recursion
        this.color.put(node, GRAY);

        // Traverse on neighboring vertices
        for (Integer neighbor : this.adjList.getOrDefault(node, new ArrayList<>())) {
            if (this.color.get(neighbor) == WHITE) {
                this.dfs(neighbor);
            } else if (this.color.get(neighbor) == GRAY) {
                // An edge to a GRAY vertex represents a cycle
                this.isPossible = false;
            }
        }

        // Recursion ends. We mark it as black
        this.color.put(node, BLACK);
        this.topologicalOrder.add(node);
    }

    private int[] findOrder(int numCourses, int[][] prerequisites) {

        this.init(numCourses);

        // Create the adjacency list representation of the graph
        for (int i = 0; i < prerequisites.length; i++) {
            int dest = prerequisites[i][0];
            int src = prerequisites[i][1];
            List<Integer> lst = adjList.getOrDefault(src, new ArrayList<>());
            lst.add(dest);
            adjList.put(src, lst);
        }

        // If the node is unprocessed, then call dfs on it.
        for (int i = 0; i < numCourses; i++) {
            if (this.color.get(i) == WHITE) {
                this.dfs(i);
            }
        }

        int[] order;
        if (this.isPossible) {
            order = new int[numCourses];
            for (int i = 0; i < numCourses; i++) {
                order[i] = this.topologicalOrder.get(numCourses - i - 1);
            }
        } else {
            order = new int[0];
        }

        return order;
    }

    public int[] findOrderDependent(int numCourses, int[][] prerequisites) {

        Map<Integer, List<Integer>> neighbors = new HashMap<>();
        int[] dependent = new int[numCourses];
        int[] topologicalOrder = new int[numCourses];


        for (int i = 0; i < prerequisites.length; i++) {
            int src = prerequisites[i][1];
            int dst = prerequisites[i][0];
            List<Integer> neig = neighbors.getOrDefault(src, new ArrayList<>());
            neig.add(dst);
            neighbors.put(i, neig);

            dependent[dst] += 1;
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (dependent[i] == 0) {
                queue.add(i);
            }
        }

        int index = 0;
        while (!queue.isEmpty()) {
            int node = queue.remove();
            topologicalOrder[index++] = node;

            if (neighbors.containsKey(node)) {
                List<Integer> lst = neighbors.get(node);
                for (Integer i : lst) {
                    --dependent[i];
                    if (dependent[i] == 0) {
                        queue.add(i);
                    }
                }
            }
        }
        if (index == numCourses)
            return topologicalOrder;
        else
            return new int[0];
    }

    // TODO: 8/27/19 WRITE TESTS INSTEAD OF main() method
    public static void main(String[] args) {
//        int[][] ints = {{1, 0}};
        int[][] ints = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
//        int[] order = new CourseScheduleII().findOrder(4, ints);
//        System.out.println(Arrays.toString(order));

        int[] ss = new int[2];
        int i = 0;
        ss[i++] = 5;
        System.out.println(Arrays.toString(ss));
        System.out.println(i);
    }
}
