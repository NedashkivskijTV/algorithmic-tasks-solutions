package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().maximumOddBinaryNumber("010")); // 001

        System.out.println(new Solution().maximumOddBinaryNumber("0101")); // 1001
    }
}