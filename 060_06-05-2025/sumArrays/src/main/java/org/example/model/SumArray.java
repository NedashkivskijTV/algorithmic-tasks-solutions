package org.example.model;

// https://www.codewars.com/kata/53dc54212259ed3d4f00071c/train/java

import java.util.Arrays;

public class SumArray {
    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }

}
