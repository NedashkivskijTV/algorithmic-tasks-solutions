package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().islandPerimeter(
                new int[][]{
                        {0, 1, 0, 0},
                        {1, 1, 1, 0},
                        {0, 1, 0, 0},
                        {1, 1, 0, 0}
                }
        )); // 16

        System.out.println(new Solution().islandPerimeter(
                new int[][]{{1}})); // 4

        System.out.println(new Solution().islandPerimeter(
                new int[][]{{1, 0}})); // 4

    }
}