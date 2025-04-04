package org.example.model;

// https://leetcode.com/problems/add-digits/

public class Solution {
    public int addDigits(int num) {
        while (num > 9) {
            int digitSum = 0;
            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }
            num = digitSum;
        }

        return num;
    }

}


/*
return num == 0 ? 0 : 1 + (num - 1) % 9;
 */