package org.example.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        int majorityLength = nums.length / 2;
        Map<Integer, Integer> elemeCounterMap = new HashMap<>();

        for (int num : nums) {
            elemeCounterMap.put(num, elemeCounterMap.getOrDefault(num, 0) + 1);
            if (elemeCounterMap.get(num) > majorityLength) {
                return num;
            }
        }

        throw new RuntimeException("Array does not exists majority elements");
    }
}
