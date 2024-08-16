package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution()
                .search(new int[]{-1, 0, 3, 5, 9, 12}, 9)); // 4
        System.out.println(new Solution()
                .search(new int[]{-1, 0, 3, 5, 9, 12}, 2)); // -1
    }

}
