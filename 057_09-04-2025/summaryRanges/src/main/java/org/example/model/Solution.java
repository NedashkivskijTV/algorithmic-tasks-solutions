package org.example.model;

// https://leetcode.com/problems/summary-ranges/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        // TODO
        List<String> resultList = new ArrayList<>();

        if (nums.length == 0) {
            return resultList;
        }

        int rangeStart = nums[0];
        int rangeEnd = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int currentNum = nums[i];

            if (rangeEnd + 1 != currentNum) {
                resultList.add(formatRange(rangeStart, rangeEnd, resultList));
                rangeStart = currentNum;
            }
            rangeEnd = currentNum;
        }

        resultList.add(formatRange(rangeStart, rangeEnd, resultList));

        return resultList;
    }

    private String formatRange(int rangeStart, int rangeEnd, List<String> resultList) {
        return rangeStart == rangeEnd ? String.valueOf(rangeStart) : rangeStart + "->" + rangeEnd;
    }

}