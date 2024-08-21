package org.example.model;

// https://leetcode.com/problems/binary-tree-inorder-traversal/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

public class Solution {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.right = new TreeNode(3);
        root1.right.right.right = new TreeNode(5);
        root1.right.right.right.left = new TreeNode(4);
        root1.left = new TreeNode(-3);
        root1.left.left = new TreeNode(-4);
        root1.left.right = new TreeNode(-2);

        System.out.println(new Solution().inorderTraversal(root1));
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<Integer> resultList = new ArrayList<>();

        // Recursively solution
        //takeResultRecursively(root, resultList);

        // Iteratively solution
        Stack<TreeNode> nodesStack = new Stack<>();
        TreeNode currentTreeNode = root;
        while (currentTreeNode != null || !nodesStack.isEmpty()) {
            while (currentTreeNode != null) {
                nodesStack.push(currentTreeNode);
                currentTreeNode = currentTreeNode.left;
            }

            currentTreeNode = nodesStack.pop();
            resultList.add(currentTreeNode.val);
            currentTreeNode = currentTreeNode.right;
        }

        return resultList;
    }

    // Recursively solution
    private void takeResultRecursively(TreeNode root, List<Integer> resultList) {
        if (root != null) {
            takeResultRecursively(root.left, resultList);
            resultList.add(root.val);
            takeResultRecursively(root.right, resultList);
        }
    }

    //Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}