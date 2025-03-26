package org.example.model;

// https://leetcode.com/problems/longest-common-prefix/

import java.util.Arrays;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minWordLength = Arrays.stream(strs)
                .map(w -> w.length())
                .min(Integer::compareTo)
                .orElse(0);

        for (int i = minWordLength; i >= 0; i--) {
            String currentPrefix = strs[0].substring(0, i);
            if (Arrays.stream(strs).allMatch(w -> w.startsWith(currentPrefix))) {
                return currentPrefix;
            }
        }

        return "";
    }
}