package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().findJudge(2, new int[][]{{1, 2}})); // 2

        System.out.println(new Solution().findJudge(3, new int[][]{{1, 3}, {2, 3}})); // 3

        System.out.println(new Solution().findJudge(3, new int[][]{{1, 3}, {2, 3}, {3, 1}})); // -1

        System.out.println(new Solution().findJudge(4, new int[][]{{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}})); // 3

    }
}