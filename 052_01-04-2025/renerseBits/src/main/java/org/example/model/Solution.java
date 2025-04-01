package org.example.model;

// https://leetcode.com/problems/reverse-bits/description/

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1; // Зсуваємо результат вліво
            result |= (n & 1); // Додаємо останній біт з n
            n >>>= 1; // Беззнаковий зсув n вправо
        }
        return result;
    }
}