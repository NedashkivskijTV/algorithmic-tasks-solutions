package org.example.model;

// https://leetcode.com/problems/min-cost-climbing-stairs/description/

public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int costLength = cost.length;
        int[] allStairsCoast = new int[costLength];
        allStairsCoast[0] = cost[0];
        allStairsCoast[1] = cost[1];

        for (int i = 2; i < costLength; i++) {
            allStairsCoast[i] = cost[i] + Math.min(allStairsCoast[i - 1], allStairsCoast[i - 2]);
        }

        return Math.min(allStairsCoast[costLength - 1], allStairsCoast[costLength - 2]);
    }

}
