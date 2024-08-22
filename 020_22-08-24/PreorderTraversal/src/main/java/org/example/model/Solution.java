package org.example.model;

// https://leetcode.com/problems/binary-tree-preorder-traversal/

import com.sun.source.tree.Tree;

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
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();

        // Recursively solution
        //preorderTraversal(root, resultList);

        // Iteratively solution
        Stack<TreeNode> nodesStack = new Stack<>();
        TreeNode currentNode = root;
        while (currentNode != null || !nodesStack.isEmpty()) {
            while (currentNode != null) {
                nodesStack.push(currentNode);
                resultList.add(currentNode.val);
                currentNode = currentNode.left;
            }

            currentNode = nodesStack.pop();
            currentNode = currentNode.right;
        }

        return resultList;
    }

    private void preorderTraversal(TreeNode root, List<Integer> resultList) {
        if (root == null) {
            return;
        }

        resultList.add(root.val);
        preorderTraversal(root.left, resultList);
        preorderTraversal(root.right, resultList);
    }

    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
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