package org.example.model;

// https://www.codewars.com/kata/559590633066759614000063/train/java

import java.util.Arrays;

public class MinMax {
    public static int[] minMax(int[] arr) {
        Arrays.sort(arr);
        return new int[]{arr[0], arr[arr.length - 1]};
    }
}