package org.example.model;

// https://leetcode.com/problems/two-sum/

import java.util.*;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // first solution
/*        int[] resultArr = new int[] {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    resultArr[0] = i;
                    resultArr[1] = j;
                    i = nums.length;
                    break;
                }
            }
        }

        return resultArr;*/

        // second solution
        Map<Integer, Integer> numPositionMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int secondNum = target - nums[i];

            if (numPositionMap.containsKey(secondNum)) {
                return new int[] {numPositionMap.get(secondNum), i};
            }

            numPositionMap.put(nums[i], i);
        }

        return new int[]{};
    }
}