package org.example.model;

// https://leetcode.com/problems/contains-duplicate-ii/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer j = numIndexMap.get(nums[i]);

            if (j != null && i - j <= k) {
                return true;
            }

            numIndexMap.put(nums[i], i);
        }

        return false;
    }

}


//slow algorithm
/*
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length && j <= k + i; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
 */