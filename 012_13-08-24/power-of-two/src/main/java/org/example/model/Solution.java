package org.example.model;

// https://leetcode.com/problems/power-of-two/submissions/1354059864/

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n = n / 2;
        }

        return true;
    }
}

/*
    double x = Math.log(n) / Math.log(2);
    return x % 1 < 0.00000001;
 */