package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().maxDepth("(1+(2*3)+((8)/4))+1")); // 3
        System.out.println(new Solution().maxDepth("(1)+((2))+(((3)))")); // 3
        System.out.println(new Solution().maxDepth("()(())((()()))")); // 3
    }
}