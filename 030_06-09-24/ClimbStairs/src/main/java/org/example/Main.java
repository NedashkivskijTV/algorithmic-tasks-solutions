package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(2)); // 2

        System.out.println(new Solution().climbStairs(3)); // 3

        System.out.println(new Solution().climbStairs(45)); // 1836311903
    }
}