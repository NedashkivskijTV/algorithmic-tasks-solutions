package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().singleNumber(new int[]{2,2,1})); // 1
        System.out.println(new Solution().singleNumber(new int[]{4,1,2,1,2})); // 4
        System.out.println(new Solution().singleNumber(new int[]{1})); // 1
    }
}