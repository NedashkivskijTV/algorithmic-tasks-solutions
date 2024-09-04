package org.example.model;

// https://www.codewars.com/kata/55fd2d567d94ac3bc9000064/train/java

public class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        int firstNum = 1;

        for (int i = 0; i < n; i++) {
            firstNum = 2 * i + firstNum;
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            result += firstNum;
            firstNum += 2;
        }

        return result;
    }

}
