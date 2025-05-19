package org.example.model;

// https://leetcode.com/problems/majority-element/?sorting=W3sic29ydE9yZGVyIjoiQVNDRU5ESU5HIiwib3JkZXJCeSI6IkRJRkZJQ1VMVFkifV0%3D

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Solution {
    public int majorityElement(int[] nums) {
        int repetition = nums.length / 2;

        Map<Integer, Integer> numRepetitionMap = new HashMap<>();
        int result = 0;

        for (int currentNum : nums) {
            result = currentNum;
            if (numRepetitionMap.containsKey(currentNum)) {
                int currentNumRepetition = numRepetitionMap.get(currentNum) + 1;
                if (currentNumRepetition > repetition) {
                    break;
                }
                numRepetitionMap.put(currentNum, currentNumRepetition);
            } else {
                numRepetitionMap.put(currentNum, 1);
            }
        }

        return result;
    }

}
