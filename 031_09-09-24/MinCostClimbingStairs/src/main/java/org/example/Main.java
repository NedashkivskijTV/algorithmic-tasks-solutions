package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().minCostClimbingStairs(new int[]{10, 15, 20})); // 15

        System.out.println(new Solution().minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1})); // 6

    }

}
