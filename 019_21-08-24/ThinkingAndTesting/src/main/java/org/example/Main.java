package org.example;

import org.example.model.ThinkingAndTesting;

public class Main {
    public static void main(String[] args) {
        System.out.println(ThinkingAndTesting.testTrueFalse(0)); // 0
        System.out.println(ThinkingAndTesting.testTrueFalse(1)); // 1

        System.out.println(ThinkingAndTesting.testTrueFalse(2)); // 1
        System.out.println(ThinkingAndTesting.testTrueFalse(3)); // 2

        System.out.println(ThinkingAndTesting.testTrueFalse(4)); // 1
        System.out.println(ThinkingAndTesting.testTrueFalse(5)); // 2
        System.out.println(ThinkingAndTesting.testTrueFalse(6)); // 2

        System.out.println(ThinkingAndTesting.testTrueFalse(7)); // 3
        System.out.println(ThinkingAndTesting.testTrueFalse(8)); // 1
        System.out.println(ThinkingAndTesting.testTrueFalse(9)); // 2
        System.out.println(ThinkingAndTesting.testTrueFalse(10)); // 2
        System.out.println(ThinkingAndTesting.testTrueFalse(100)); // 3
        System.out.println(ThinkingAndTesting.testTrueFalse(1000)); // 6
        System.out.println(ThinkingAndTesting.testTrueFalse(10000)); // 5
    }
}