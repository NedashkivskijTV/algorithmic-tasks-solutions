package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution()
                .countSegments("Hello, my name is John")); // 5

        System.out.println(new Solution()
                .countSegments("Hello")); // 1

        System.out.println(new Solution()
                .countSegments("")); // 1

        System.out.println(new Solution()
                .countSegments("    foo    bar")); // 2
    }

}
