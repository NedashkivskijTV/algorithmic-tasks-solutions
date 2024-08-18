package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution(6).guessNumber(10)); // 6
        System.out.println(new Solution(1).guessNumber(1)); // 1
        System.out.println(new Solution(1).guessNumber(2)); // 1
    }
}