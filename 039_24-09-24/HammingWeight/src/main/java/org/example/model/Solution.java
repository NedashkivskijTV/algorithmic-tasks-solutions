package org.example.model;

// https://leetcode.com/problems/number-of-1-bits/

public class Solution {
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}