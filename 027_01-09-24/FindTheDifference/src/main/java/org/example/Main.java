package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(new Solution().findTheDifference("abcd", "abcde")); // e
        System.out.println(new Solution().findTheDifference("", "y")); // y
    }
}