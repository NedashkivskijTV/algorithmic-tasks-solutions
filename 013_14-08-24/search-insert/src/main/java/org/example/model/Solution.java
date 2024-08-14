package org.example.model;

// https://leetcode.com/problems/search-insert-position/

import java.util.stream.IntStream;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        return IntStream.range(0, nums.length)
                .filter(i -> nums[i] >= target)
                .findFirst()
                .orElse(nums.length);
    }
}


// first solution
/*
        java.util.OptionalInt targetPosition = IntStream.range(0, nums.length)
                .filter(i -> nums[i] == target)
                .findFirst();

        if (targetPosition.orElse(-1) != -1) {
            return targetPosition.getAsInt();
        }
        if (target < nums[0]) {
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }

        java.util.OptionalInt first = IntStream.range(0, nums.length - 1)
                .filter(i -> (i == nums.length - 1 && nums[i] < target) || (nums[i] <= target && nums[i + 1] > target))
                .findFirst();

        return first.orElse(0) + 1;
 */
