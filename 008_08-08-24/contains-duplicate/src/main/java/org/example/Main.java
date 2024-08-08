package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution()
                .containsNearbyDuplicate(new int[] {1,2,3,1}, 3)); // true
        System.out.println(new Solution()
                .containsNearbyDuplicate(new int[] {1,0,1,1}, 1)); // true
        System.out.println(new Solution()
                .containsNearbyDuplicate(new int[] {1,2,3,1,2,3}, 2)); // false
    }
}