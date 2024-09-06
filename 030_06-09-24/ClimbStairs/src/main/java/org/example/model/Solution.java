package org.example.model;

// https://leetcode.com/problems/climbing-stairs/

public class Solution {
    public int climbStairs(int n) {
// solution with recursion
//        if (n == 1) {
//            return 1;
//        }
//        if (n == 2) {
//            return 2;
//        }
//
//        return climbStairs(n - 1) + climbStairs(n - 2);


// solution with dynamic programing
        if (n == 1) {
            return 1;
        }

        int firstStep = 1;
        int secondStep = 2;

        for (int i = 3; i <= n ; i++) {
            int thirdStep = firstStep + secondStep;
            firstStep = secondStep;
            secondStep = thirdStep;
        }

        return secondStep;
    }
}