package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().start1(
                new int[]{1, 2, 3},
                new int[]{1, 3}
        )); // 2

        System.out.println(new Solution().start1(
                new int[]{7, 2, 3},
                new int[]{1}
        )); // 1

        System.out.println(new Solution().start1(
                new int[]{1, 2},
                new int[]{}
        )); // 1
    }

}
