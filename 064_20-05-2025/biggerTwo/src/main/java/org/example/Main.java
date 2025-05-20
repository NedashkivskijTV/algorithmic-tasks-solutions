package org.example;

import org.example.model.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().biggerTwo(
                new int[]{1, 2},
                new int[]{3, 4}
        ))); // [3,4]

        System.out.println(Arrays.toString(new Solution().biggerTwo(
                new int[]{3, 4},
                new int[]{1, 2}
        ))); // [3,4]

        System.out.println(Arrays.toString(new Solution().biggerTwo(
                new int[]{1, 1},
                new int[]{1, 2}
        ))); // [1,2]
    }

}
