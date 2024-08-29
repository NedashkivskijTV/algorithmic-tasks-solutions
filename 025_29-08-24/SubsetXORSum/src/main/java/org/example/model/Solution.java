package org.example.model;

// https://leetcode.com/problems/sum-of-all-subset-xor-totals/description/

public class Solution {
    public int subsetXORSum(int[] nums) {
        return calculateXOR(nums, 0, 0);
    }

    private int calculateXOR(int[] nums, int index, int currentXOR) {
        if (index == nums.length) {
            return currentXOR;
        }

        int include = calculateXOR(nums, index + 1, currentXOR ^ nums[index]);
        int exclude = calculateXOR(nums, index + 1, currentXOR);

        return include + exclude;
    }

}
