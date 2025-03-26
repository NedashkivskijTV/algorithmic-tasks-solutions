package org.example.model;

// https://leetcode.com/problems/counting-bits/

public class Solution {
    public int[] countBits(int n) {
        int[] resultArr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            resultArr[i] = Integer.bitCount(i);

            //resultArr[i] = resultArr[i >> 1] + (i & 1);
        }
        return resultArr;
    }
}