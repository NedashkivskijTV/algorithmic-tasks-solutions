package org.example;

import org.example.model.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                new Solution().twoSum(new int[]{2,7,11,15}, 9))); // [0, 1]

        System.out.println(Arrays.toString(
                new Solution().twoSum(new int[]{3,2,4}, 6))); // [1, 2]

        System.out.println(Arrays.toString(
                new Solution().twoSum(new int[]{3,3}, 6))); // [0, 1]

    }
}
