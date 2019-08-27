package com.core.algorithms.leetcode.easy;


public class MaxDepthOfBinaryTree {

    private static TreeNode treeNode;

    public static int maxDepth(TreeNode root) {
        return 0;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private static void insertIntoBinaryTree(int val) {
        if (treeNode == null){
            treeNode = new TreeNode(val);
        } else {

        }
    }

    public static void main(String[] args) {

    }
}
