package org.example;

import org.example.model.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                new Solution().maxEnd3(new int[]{1, 2, 3}))); // [3, 3, 3]
    }

}
