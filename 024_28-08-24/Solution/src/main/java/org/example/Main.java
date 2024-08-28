package org.example;

import org.example.model.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Solution().kClosest(
                new int[][]{{1, 3}, {-2, 2}}, 1))); // [[-2, 2]]

        System.out.println(Arrays.deepToString(new Solution().kClosest(
                new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2))); // [[3, 3], [-2, 4]]

        System.out.println(Arrays.deepToString(new Solution().kClosest(
                new int[][]{{-5, 4}, {-6, -5}, {4, 6}}, 2))); // [[-5, 4], [4, 6]]

    }

}
