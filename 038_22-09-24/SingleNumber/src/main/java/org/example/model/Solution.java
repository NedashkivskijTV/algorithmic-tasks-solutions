package org.example.model;

// https://leetcode.com/problems/single-number/description/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int singleNumber(int[] nums) {
/*
// first solution
        List<Integer> integerList = new ArrayList<>();
        for (int num : nums) {
            if (integerList.contains(num)) {
                integerList.remove(Integer.valueOf(num));
            } else {
                integerList.add(num);
            }
        }
        return integerList.getFirst();
*/

        // second solution
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}