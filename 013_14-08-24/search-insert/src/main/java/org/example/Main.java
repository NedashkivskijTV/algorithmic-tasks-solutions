package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution()
                .searchInsert(new int[] {1,3,5,6}, 5)); // 2
        System.out.println(new Solution()
                .searchInsert(new int[] {1,3,5,6}, 2)); // 1
        System.out.println(new Solution()
                .searchInsert(new int[] {1,3,5,6}, 7)); // 4
    }
}
