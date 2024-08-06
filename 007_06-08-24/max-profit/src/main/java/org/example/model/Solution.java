package org.example.model;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int profit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                int currentProfit = price - minPrice;
                profit = Math.max(currentProfit, profit);
            }
        }
        return profit;
    }

}
