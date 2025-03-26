package org.example.model;

// https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/

public class Solution {
    public int countOdds(int low, int high) {
        int firstOdd = low % 2 != 0 ? low : low + 1;
        int lastOdd = high % 2 != 0 ? high : high - 1;
        return (lastOdd - firstOdd) / 2 + 1;
    }

}
