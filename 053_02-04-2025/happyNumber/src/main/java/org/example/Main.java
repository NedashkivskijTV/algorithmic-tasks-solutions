package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().isHappy(19)); // true
        System.out.println(new Solution().isHappy(2)); // false
    }
}