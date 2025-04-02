package org.example.model;

// https://leetcode.com/problems/happy-number/

import java.util.HashSet;
import java.util.Set;

public  class Solution {
    public boolean isHappy(int n) {
        // TODO
        Set<Integer> numberSet = new HashSet<>();
        while (n !=  1 && !numberSet.contains(n)) {
            numberSet.add(n);
            n = getSumOfSquares(n);
        }

        return n == 1;
    }

    private int getSumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int currentDigit = num % 10;
            sum += currentDigit * currentDigit;
            num /= 10;
        }
        return sum;
    }
}