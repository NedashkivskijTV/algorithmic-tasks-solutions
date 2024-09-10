package org.example.model;

// https://leetcode.com/problems/buy-two-chocolates/

import java.util.Arrays;

public class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int minCost = prices[0] + prices[1];
        return minCost <= money ? money - minCost : money;
    }
}