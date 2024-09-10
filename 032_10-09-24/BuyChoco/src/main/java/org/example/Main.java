package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().buyChoco(new int[]{1,2,2}, 3)); // 0

        System.out.println(new Solution().buyChoco(new int[]{3,2,3}, 3)); // 3
    }
}