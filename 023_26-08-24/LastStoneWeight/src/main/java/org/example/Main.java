package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().lastStoneWeight(new int []{2,7,4,1,8,1})); // 1
        System.out.println(new Solution().lastStoneWeight(new int []{1})); // 1
        System.out.println(new Solution().lastStoneWeight(new int []{0, 0})); // 0
    }
}