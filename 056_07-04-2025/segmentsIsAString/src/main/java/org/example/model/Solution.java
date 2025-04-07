package org.example.model;

// https://leetcode.com/problems/number-of-segments-in-a-string/

public class Solution {
    public int countSegments(String s) {
        s = s.trim();
        return s.length() == 0 ? 0 : s.split("\\s+").length;
    }

}
