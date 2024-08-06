package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit(new int[]{7, 1, 5, 3, 6, 4})); // 5

        System.out.println(new Solution().maxProfit(new int[]{7, 6, 4, 3, 1})); // 0

        System.out.println(new Solution().maxProfit(new int[]{2, 4, 1})); // 2
    }
}