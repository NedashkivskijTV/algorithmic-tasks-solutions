package org.example.model;

// https://www.codewars.com/kata/5949481f86420f59480000e7/train/java

import java.util.Arrays;

public class Codewars {
    public static String oddOrEven(int[] array) {
        int sum = Arrays.stream(array).sum();
        return sum % 2 == 0 ? "even" : "odd";
    }
}