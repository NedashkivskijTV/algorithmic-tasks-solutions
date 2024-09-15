package org.example.model;

// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/

public class Solution {
    public int maxDepth(String s) {
        int maxNested = 0;
        int currentNested = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                currentNested++;
                if (currentNested > maxNested) {
                    maxNested = currentNested;
                }
            } else if (c == ')') {
                currentNested--;
            }
        }
        
        return maxNested;
    }
}