package org.example.model;

// https://leetcode.com/problems/is-subsequence/

public class Solution {
    public boolean isSubsequence(String s, String t) {
        int symbolPosition = -1;

        for (char c : s.toCharArray()) {
            int currentSymbolPosition = t.indexOf(c, symbolPosition + 1);
            if (currentSymbolPosition <= symbolPosition) {
                return false;
            }
            symbolPosition = currentSymbolPosition;
        }

        return true;
    }
}