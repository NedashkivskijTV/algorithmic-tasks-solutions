package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().hammingWeight(11)); // 3
        System.out.println(new Solution().hammingWeight(128)); // 1
        System.out.println(new Solution().hammingWeight(2147483645)); // 30
    }
}