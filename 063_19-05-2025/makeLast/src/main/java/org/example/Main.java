package org.example;

import org.example.model.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                new Solution().makeLast(new int[]{4, 5, 6}))); // 0, 0, 0, 0, 0, 6
        System.out.println(Arrays.toString(
                new Solution().makeLast(new int[]{1, 2}))); // 0, 0, 0, 2
        System.out.println(Arrays.toString(
                new Solution().makeLast(new int[]{3}))); // 0, 3
    }

}
