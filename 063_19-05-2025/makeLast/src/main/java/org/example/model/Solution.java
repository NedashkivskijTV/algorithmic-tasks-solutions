package org.example.model;

// https://codingbat.com/prob/p137188

public class Solution {
    public int[] makeLast(int[] nums) {
        int[] resultArr = new int[nums.length * 2];
        resultArr[resultArr.length - 1] = nums[nums.length - 1];
        return resultArr;
    }

}
