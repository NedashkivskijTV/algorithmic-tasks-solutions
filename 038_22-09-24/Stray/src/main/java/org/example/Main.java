package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.stray(new int[]{1,2,2})); // 2
        System.out.println(Solution.stray(new int[]{17, 17, 3, 17, 17, 17, 17})); // 3
    }
}
