package org.example;

import org.example.model.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                new Solution().fix23(new int[] {1,2,3}))); // 1,2,0
        System.out.println(Arrays.toString(
                new Solution().fix23(new int[] {2, 3, 5}))); // 2, 0, 5
        System.out.println(Arrays.toString(
                new Solution().fix23(new int[] {1,2,1}))); // 1,2,1
    }

}
