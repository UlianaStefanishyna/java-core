package com.core.algorithms.leetcode.medium;

import java.util.*;

public class Test {

    private int NOT_REVIEWED_YET = 1;
    private int REVIEWED = 2;
    private int TAKEN = 3;

    private List<Integer> courseScheduler = new ArrayList<>();
    private Map<Integer, Integer> states = new HashMap<>();
    private Map<Integer, List<Integer>> courseDependencies = new HashMap<>();
    private boolean isCycleDependency = false;

    public Test(int coursesAmount) {
        for (int i = 0; i < coursesAmount; i++) {
            this.states.put(i, NOT_REVIEWED_YET);
        }
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        for (int i = 0; i < numCourses; i++) {
            int dependentCourse = prerequisites[i][0];
            int primaryCourse = prerequisites[i][1];
            List<Integer> dependentCourses = this.courseDependencies.getOrDefault(primaryCourse, new ArrayList<>());
            dependentCourses.add(dependentCourse);
            this.courseDependencies.put(primaryCourse, dependentCourses);
        }

        for (int i = 0; i < numCourses; i++) {
            if (this.states.get(i) == NOT_REVIEWED_YET) {
                this.dfs(i);
            }
        }

        int[] rightOrder;
        if (!this.isCycleDependency) {
            rightOrder = new int[numCourses];
            for (int i = 0; i < numCourses; i++) {
                rightOrder[i] = this.courseScheduler.get(numCourses - 1 - i);
            }
        } else {
            rightOrder = new int[0];
        }
        return rightOrder;
    }

    private void dfs(int currentCourse) {

        if (this.isCycleDependency) {
            return;
        }

        this.states.put(currentCourse, REVIEWED);

        for (Integer node : this.courseDependencies.getOrDefault(currentCourse, new ArrayList<>())) {
            if (this.states.get(node) == NOT_REVIEWED_YET) {
                dfs(node);
            } else if (this.states.get(node) == REVIEWED) {
                this.isCycleDependency = true;
            }
        }

        this.states.put(currentCourse, TAKEN);
        this.courseScheduler.add(currentCourse);
    }

    public static void main(String[] args) {
        int[][] ints = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};

        int[] order = new Test(4).findOrder(4, ints);
        System.out.println(Arrays.toString(order));


    }
}
